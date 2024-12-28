/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ead.senac.tds.Projeto.model;

/**
 *
 * @author josue
 */
public class Decimal {
    
    private Float decimal;
    private boolean valid;
    
    public Decimal(String txt){
        
        boolean val = true;
        
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
                    val = false;
                }
                break;
                
                default:
                val = false;
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
                
                numb = numb/10f;
                
            }
            
        }//if(d1 < d2)
        
        this.decimal = numb;
        
        this.valid = val;
        
    }//Decimal(String txt)
    
    public Decimal(String txt, int divide){
        
        boolean val = true;
        
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
                    val = false;
                }
                break;
                
                default:
                val = false;
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
                
                numb = numb/10f;
                
                if(i >= divide){
                    
                    break;
                    
                }//if(i >= divide)
                
            }//for(int i = d1; i < d2;i++)
            
        }//if(d1 < d2)
        
        this.decimal = numb;
        
        this.valid = val;
        
    }//Decimal(String txt)
    
    public boolean Val(){
        return this.valid;
    }
    
    public Float Dec(){
        return this.decimal;
    }
    
    public Float Dec(int dec){
        
        Float div = 1f;
        
        if(dec <= 1){
            div = 10f;
        } else {
            div = dec*10f;
        }
        
        int numb = Math.round(this.decimal*div);
        
        return (float)numb / div;
        
    }
    
}