/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author josue
 */
public class cod {
    
    private LocalDate data;
    private LocalTime time;
    private Float decimal;
    private int inteiro;
    
    public cod(){
        
        this.data = LocalDate.now();
        this.time = LocalTime.now();
        this.decimal = 0f;
        this.inteiro = 0;
        
    }
    
    public cod(LocalDate data){
        
        this.data = data;
        this.time = LocalTime.of(0, 0, 0);
        this.decimal = 0f;
        this.inteiro = 0;
        
    }
    
    public cod(LocalDate data, LocalTime time){
        
        this.data = data;
        this.time = time;
        this.decimal = 0f;
        this.inteiro = 0;
        
    }
    
    public int Int(){
        return this.inteiro;
    }
    
    public float Dec(){
        return this.decimal;
    }
    
    public void setData(LocalDate data){
        this.data = data;
    }
    
    public void setTime(LocalTime time){
        this.time = time;
    }
    
    public LocalDate getData(){
        
        return this.data;
        
    }
    
    public LocalTime getHora(){
        
        return this.time;
        
    }
    
    public String Date(boolean value){
        
        String txt = "";
        
        if(value){
            
            if(this.data.getDayOfMonth() < 10){
                txt += "0";
            }
            
            txt += this.data.getDayOfMonth();
            txt += "/";

            if(this.data.getMonthValue() < 10){
                txt += "0";
            }

            txt += this.data.getMonthValue();
            txt += "/";
            
            txt += this.data.getYear();
            
        } else {
            
            txt += this.data.getYear();
            txt += "-";

            if(this.data.getMonthValue() < 10){
                txt += "0";
            }

            txt += this.data.getMonthValue();
            txt += "-";

            if(this.data.getDayOfMonth() < 10){
                txt += "0";
            }

            txt += this.data.getDayOfMonth();
        
        }
        
        return txt;
        
    }//inDate(LocalDate data)
    
    public String Date(String data){
        
        String tema = "";
        
        int year = 0;
        int month = 0;
        int day = 0;
        
        try{
        
            if(data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")){

                for(int i = 0; i < 10; i++){

                    int num;

                    switch(data.charAt(i)){

                        case '1':
                        num = 1;
                        break;

                        case '2':
                        num = 2;
                        break;

                        case '3':
                        num = 3;
                        break;

                        case '4':
                        num = 4;
                        break;

                        case '5':
                        num = 5;
                        break;

                        case '6':
                        num = 6;
                        break;

                        case '7':
                        num = 7;
                        break;

                        case '8':
                        num = 8;
                        break;

                        case '9':
                        num = 9;
                        break;

                        default:
                        num = 0;
                        break;

                    }//switch(data.charAt(i))

                    switch(i+1){

                        case 1:
                        day = num;
                        break;

                        case 2:
                        day = day*10 + num;
                        break;

                        case 4:
                        month = num;
                        break;

                        case 5:
                        month = month*10 + num;
                        break;

                        case 7:
                        year = num;
                        break;

                        case 8:
                        year = year*10 + num;
                        break;

                        case 9:
                        year = year*10 + num;
                        break;

                        case 10:
                        year = year*10 + num;
                        break;

                    }//switch(i+1)

                }//for(int i = 0; i < 10; i++)
                
                this.data = LocalDate.of(year, month, day);

            } else if(data.matches("[0-9]{4}[-][0-9]{2}[-][0-9]{2}")){

                for(int i = 0; i < 10; i++){

                    int num;

                    switch(data.charAt(i)){

                        case '1':
                        num = 1;
                        break;

                        case '2':
                        num = 2;
                        break;

                        case '3':
                        num = 3;
                        break;

                        case '4':
                        num = 4;
                        break;

                        case '5':
                        num = 5;
                        break;

                        case '6':
                        num = 6;
                        break;

                        case '7':
                        num = 7;
                        break;

                        case '8':
                        num = 8;
                        break;

                        case '9':
                        num = 9;
                        break;

                        default:
                        num = 0;
                        break;

                    }//switch(data.charAt(i))

                    switch(i+1){

                        case 1:
                        year = num;
                        break;

                        case 2:
                        year = year*10 + num;
                        break;

                        case 3:
                        year = year*10 + num;
                        break;

                        case 4:
                        year = year*10 + num;
                        break;

                        case 6:
                        month = num;
                        break;

                        case 7:
                        month = month*10 + num;
                        break;

                        case 9:
                        day = num;
                        break;

                        case 10:
                        day = day*10 + num;
                        break;

                    }//switch(i+1)

                }//for(int i = 0; i < 10; i++)
                
                this.data = LocalDate.of(year, month, day);

            } else {

                tema = "Data inválida!";

            }//if
        
        } catch(Exception e){
            
            tema = e.getMessage();
            
        }
        
        return tema;
        
    }//outDate(String data)
    
    public String Time(boolean value){
        
        String sep = value ? ":":"-";
        
        String txt = "";
        
        if(this.time.getHour() < 10){
            txt += "0";
        }
        
        txt += this.time.getHour();
        txt += sep;
        
        if(this.time.getMinute() < 10){
            txt += "0";
        }
        
        txt += this.time.getMinute();
        txt += sep;
        
        if(this.time.getSecond() < 10){
            txt += "0";
        }
        
        txt += this.time.getSecond();
        
        return txt;
        
    }//inTime(LocalTime time)
    
    public String Time(String time){
        
        String tema = "";
            
        int hour = 0;
        int minute = 0;
        int second = 0;
        
        try{
            if(time.matches("[0-9]{1}[-][0-9]{2}[-][0-9]{2}") || time.matches("[0-9]{1}[:][0-9]{2}[:][0-9]{2}")){
                
                for(int i = 0; i < 8; i++){
                    
                    int num;
                    
                    switch(time.charAt(i)){
                        
                        case '1':
                        num = 1;
                        break;
                        
                        case '2':
                        num = 2;
                        break;
                        
                        case '3':
                        num = 3;
                        break;
                        
                        case '4':
                        num = 4;
                        break;
                        
                        case '5':
                        num = 5;
                        break;
                        
                        case '6':
                        num = 6;
                        break;
                        
                        case '7':
                        num = 7;
                        break;
                        
                        case '8':
                        num = 8;
                        break;
                        
                        case '9':
                        num = 9;
                        break;
                        
                        default:
                        num = 0;
                        break;
                        
                    }//switch(time.charAt(i))
                    
                    switch(i+1){
                        
                        case 1:
                        hour = num;
                        break;
                        
                        case 3:
                        minute = num;
                        break;
                        
                        case 4:
                        minute = minute*10 + num;
                        break;
                        
                        case 6:
                        second = num;
                        break;
                        
                        case 7:
                        second = second*10 + num;
                        break;
                        
                    }//switch(i+1)
                    
                }//for(int i = 0; i < 8; i++)
                
                this.time = LocalTime.of(hour, minute, second);
                
            } else if(time.matches("[0-9]{1}[:][0-9]{2}") || time.matches("[0-9]{1}[-][0-9]{2}")){
                
                for(int i = 0; i < 5; i++){
                    
                    int num;
                    
                    switch(time.charAt(i)){
                        
                        case '1':
                        num = 1;
                        break;
                        
                        case '2':
                        num = 2;
                        break;
                        
                        case '3':
                        num = 3;
                        
                        case '4':
                        num = 4;
                        break;
                        
                        case '5':
                        num = 5;
                        break;
                        
                        case '6':
                        num = 6;
                        break;
                        
                        case '7':
                        num = 7;
                        break;
                        
                        case '8':
                        num = 8;
                        break;
                        
                        case '9':
                        num = 9;
                        break;
                        
                        default:
                        num = 0;
                        break;
                        
                    }//switch(time.charAt(i))
                    
                    switch(i+1){
                        
                        case 1:
                        hour = num;
                        break;
                        
                        case 3:
                        minute = num;
                        break;
                        
                        case 4:
                        minute = minute*10 + num;
                        break;
                        
                    }//switch(i+1)
                    
                }//for(int i = 0; i < 8; i++)
                
                this.time = LocalTime.of(hour, minute, 0);
                
            } else if(time.matches("[0-9]{2}[-][0-9]{2}[-][0-9]{2}") || time.matches("[0-9]{2}[:][0-9]{2}[:][0-9]{2}")){
                
                for(int i = 0; i < 8; i++){
                    
                    int num;
                    
                    switch(time.charAt(i)){
                        
                        case '1':
                        num = 1;
                        break;
                        
                        case '2':
                        num = 2;
                        break;
                        
                        case '3':
                        num = 3;
                        break;
                        
                        case '4':
                        num = 4;
                        break;
                        
                        case '5':
                        num = 5;
                        break;
                        
                        case '6':
                        num = 6;
                        break;
                        
                        case '7':
                        num = 7;
                        break;
                        
                        case '8':
                        num = 8;
                        break;
                        
                        case '9':
                        num = 9;
                        break;
                        
                        default:
                        num = 0;
                        break;
                        
                    }//switch(time.charAt(i))
                    
                    switch(i+1){
                        
                        case 1:
                        hour = num;
                        break;
                        
                        case 2:
                        hour = hour*10 + num;
                        break;
                        
                        case 4:
                        minute = num;
                        break;
                        
                        case 5:
                        minute = minute*10 + num;
                        break;
                        
                        case 7:
                        second = num;
                        break;
                        
                        case 8:
                        second = second*10 + num;
                        break;
                        
                    }//switch(i+1)
                    
                }//for(int i = 0; i < 8; i++)
                
                this.time = LocalTime.of(hour, minute, second);
                
            } else if(time.matches("[0-9]{2}[-][0-9]{2}") || time.matches("[0-9]{2}[:][0-9]{2}")){
                
                for(int i = 0; i < 5; i++){
                    
                    int num;
                    
                    switch(time.charAt(i)){
                        
                        case '1':
                        num = 1;
                        break;
                        
                        case '2':
                        num = 2;
                        break;
                        
                        case '3':
                        num = 3;
                        
                        case '4':
                        num = 4;
                        break;
                        
                        case '5':
                        num = 5;
                        break;
                        
                        case '6':
                        num = 6;
                        break;
                        
                        case '7':
                        num = 7;
                        break;
                        
                        case '8':
                        num = 8;
                        break;
                        
                        case '9':
                        num = 9;
                        break;
                        
                        default:
                        num = 0;
                        break;
                        
                    }//switch(time.charAt(i))
                    
                    switch(i+1){
                        
                        case 1:
                        hour = num;
                        break;
                        
                        case 2:
                        hour = hour*10 + num;
                        break;
                        
                        case 4:
                        minute = num;
                        break;
                        
                        case 5:
                        minute = minute*10 + num;
                        break;
                        
                    }//switch(i+1)
                    
                }//for(int i = 0; i < 8; i++)
                
                this.time = LocalTime.of(hour, minute, 0);
                
            } else {
                
                tema = "Hora inválida!";
                
            }
            
        }catch(Exception e){
            
            tema = e.getMessage();
            
        }
                
        return tema;
        
    }//outTime(String txt)
    
    public boolean toInteger(String txt){
        
        boolean valid = true;
        
        int numb = 0;
        
        for(int i = 0; i < txt.length(); i ++){
            
            switch(txt.charAt(i)){
                
                case '1':
                numb = numb*10 + 1;
                break;
                
                case '2':
                numb = numb*10 + 2;
                break;
                
                case '3':
                numb = numb*10 + 3;
                break;
                
                case '4':
                numb = numb*10 + 4;
                break;
                
                case '5':
                numb = numb*10 + 5;
                break;
                
                case '6':
                numb = numb*10 + 6;
                break;
                
                case '7':
                numb = numb*10 + 7;
                break;
                
                case '8':
                numb = numb*10 + 8;
                break;
                
                case '9':
                numb = numb*10 + 9;
                break;
                
                case '0':
                numb = numb*10;
                break;
                
                default:
                valid = false;
                break;
                
            }//switch(txt.charAt(i))
            
        }//for(int i = 0; i < txt.length(); i ++)
        
        this.inteiro = numb;
        
        return valid;
        
    }//toInteger(String txt)
    
    public boolean toFloat(String txt){
        
        boolean valid = true;
        
        float numb = 0.0f;
        
        boolean sep = true;
        int d1 = 0;
        int d2 = 0;
        
        for(int i = 0; i < txt.length(); i++){
            
            switch(txt.charAt(i)){
                
                case '1':
                numb = numb*10f + 1f;
                break;
                
                case '2':
                numb = numb*10f + 2f;
                break;
                
                case '3':
                numb = numb*10f + 3f;
                break;
                
                case '4':
                numb = numb*10f + 4f;
                break;
                
                case '5':
                numb = numb*10f + 5f;
                break;
                
                case '6':
                numb = numb*10f + 6f;
                break;
                
                case '7':
                numb = numb*10f + 7f;
                break;
                
                case '8':
                numb = numb*10f + 8f;
                break;
                
                case '9':
                numb = numb*10f + 9f;
                break;
                
                case '0':
                numb = numb*10f;
                break;
                
                case ',':
                case '.':
                if(sep){
                    d1 = i;
                    sep = false;
                } else {
                    valid = false;
                }
                break;
                
                default:
                valid = false;
                break;
                
            }//switch - 1/2
            
            if(d1 > 0){
                
                switch(txt.charAt(i)){
                    
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    d2 = i;
                    break;

                }//switch - 2/2
                
            }//if(d1 > 0)
            
        }//for(int i = 0; i < txt.length(); i++)
        
        if(d1 < d2){
            
            for(int i = d1; i < d2;i++){
                
                numb = numb/10;
                
            }
            
        }//if(d1 < d2)
        
        this.decimal = numb;
        
        return valid;
        
    }//toFloat(String txt)
    
}//Class