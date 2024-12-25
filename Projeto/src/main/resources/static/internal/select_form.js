/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

document.getElementsByTagName("html")[0].addEventListener("click", function(){
    console.clear();
});

function Text(ds){

    let txt = "";

    var action = true;
    var space = true;
    var letter = false;

    for(var i = 0; i < ds.length; i++){

        switch(ds[i]){

            case '\\':
            case '/':
            case '|':
            case '[':
            case '{':
            case '(':
            case '=':
            if(action && letter && i < ds.length-2){
                txt += " [";
                action = false;
            } else {
                txt += " ";
            }
            space = false;
            break;

            case '+':
            case '-':
            case '_':
            case ' ':
            if(space){
                txt += " ";
                space = false;
            }
            break;

            default:
            txt += ds[i];
            letter = true;
            space = true;
            break;

        }

    }

    return txt;

}//Text(ds)

function Submit(){

    const x = document.forms["frm"];

    for (let i = 0; i < x.length ;i++) {

        switch(x.elements[i].type.toLowerCase()){

            case "text":
                x.elements[i].value = Text(x.elements[i].value);
            break;

        }

    }

}//Submit()

document.getElementById("frm").addEventListener("submit",Submit);