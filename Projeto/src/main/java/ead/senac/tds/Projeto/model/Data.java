/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ead.senac.tds.Projeto.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author josue
 */
public class Data {
    
    private LocalDate dia;
    private boolean hoje;
    private String valid;
    
    public Data(){
        
        this.dia = LocalDate.now();
        this.hoje = true;
        this.valid = "";
        
    }//Data()
    
    public Data(LocalDate data){
        
        this.dia = data;
        this.hoje = false;
        this.valid = "";
        
    }//Data(LocalDate data)
    
    public Data(String data){
        
        this.hoje = false;
        this.valid = "";
        
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
                
                this.dia = LocalDate.of(year, month, day);

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
                
                this.dia = LocalDate.of(year, month, day);

            } else {
                
                this.dia = LocalDate.now();
                this.valid = "Data inválida!";

            }//if
        
        } catch(Exception e){
            
            this.dia = LocalDate.now();
            this.valid = e.getMessage();
            
        }
        
    }//Date(String data)
    
    public boolean Val(){
        return this.valid.isBlank();
    }
    
    public String Error(){
        return this.valid;
    }
    
    public boolean Hoje(){
        return this.hoje;
    }
    
    public LocalDate getData(){
        
        return this.dia;
        
    }
    
    private String Event(){
        
        String txt = "";
        
        if(this.hoje){
            
            final String comp[] = {"Bom Dia", "Boa Tarde", "Boa Noite"};
            
            if(LocalTime.now().getHour() < 12){
                txt = comp[0];
            } else if(LocalTime.now().getHour() < 18){
                txt = comp[1];
            } else if(LocalTime.now().getHour() > 18){
                txt = comp[2];
            } else if(LocalTime.now().getMinute() <= 30){
                txt = comp[1];
            } else {
                txt = comp[2];
            }
            
        }
        
        return txt;
    }
    
    public String DataAbreviada(){
        
        final String separator = "/";
        
        int a = this.dia.getYear();
        int m = this.dia.getMonthValue();
        int d = this.dia.getDayOfMonth();
        
        String txt = "";
        
        if(d < 10){
            txt += "0";
        }
        
        txt += d;
        txt += separator;
        
        if(m < 10){
            txt += "0";
        }
        
        txt += m;
        txt += separator;
        txt += a;
        
        return txt;
        
    }//DataAbreviada()
    
    public String DataCompleta(){
        
        int a = this.dia.getYear();
        int m = this.dia.getMonthValue();
        int d = this.dia.getDayOfMonth();
        int s = this.dia.getDayOfWeek().getValue();
        
        String txt = "";
        
        if(this.hoje){
            txt += Event();
            txt += ", hoje é ";
        }
        
        switch(s){
            
            case 1 ->{
                txt += "Segunda";
            }
            
            case 2 ->{
                txt += "Terça";
            }
            
            case 3 ->{
                txt += "Quarta";
            }
            
            case 4 ->{
                txt += "Quinta";
            }
            
            case 5 ->{
                txt += "Sexta";
            }
            
            case 6 ->{
                txt += "Sábado";
            }
            
            case 7 ->{
                txt += "Domingo";
            }
            
        }//switch(s)
        
        if(s < 6){
            
            txt += "-feira";
            
        }
        
        txt += ", dia ";
        
        txt += d;
        
        if(d == 1){
            txt += "º";
        }
        
        txt += " de ";
        
        switch(m){
            
            case 1 ->{
                txt += "Janeiro";
            }
            
            case 2 ->{
                txt += "Fevereiro";
            }
            
            case 3 ->{
                txt += "Março";
            }
            
            case 4 ->{
                txt += "Abril";
            }
            
            case 5 ->{
                txt += "Maio";
            }
            
            case 6 ->{
                txt += "Junho";
            }
            
            case 7 ->{
                txt += "Julho";
            }
            
            case 8 ->{
                txt += "Agosto";
            }
            
            case 9 ->{
                txt += "Setembro";
            }
            
            case 10 ->{
                txt += "Outubro";
            }
            
            case 11 ->{
                txt += "Novembro";
            }
            
            case 12 ->{
                txt += "Dezembro";
            }
            
        }//switch(m)
        
        txt += " de ";
        
        txt += a;
        
        if(this.hoje){
            txt += "!";
        }
        
        return txt;
        
    }//DataCompleta()
    
    public String DataLinha(boolean ifo){
        
        String txt = "";
        
        int dg = LocalDate.now().getDayOfYear();
        int dt = this.dia.getDayOfYear();
        
        int ag = LocalDate.now().getYear();
        int at = this.dia.getYear();
        
        if(ag - at == 1){//if
            
            if(ifo){
                txt += "ANO PASSADO";
            } else {
                txt += "ano passado";
            }
            
        } else if(ag > at){//if
            
            int year = ag - at;
            
            if(!ifo){
                txt += "há ";
            }
            
            txt += year;
            
            if(ifo){
                txt += " ANOS ATRÁS";
            } else {
                txt += " anos atrás";
            }
            
        } else if(dg == dt && ag >= at){//if
            
            if(ifo){
                txt += "HOJE";
            } else {
                txt += "hoje";
            }
            
        } else if(dg - dt == 1 && ag >= at){//if
            
            if(ifo){
                txt += "ONTEM";
            } else {
                txt += "ontem";
            }
            
        } else if(dg - dt > 30 && ag >= at){//if
            
            int mes = LocalDate.now().getMonthValue() - this.dia.getMonthValue();
            
            if(mes == 0){
                
                if(ifo){
                    txt += "ESTE MÊS";
                } else {
                    txt += "este mês";
                }
                
            } else if(mes == 1){//if(mes == 0)
                
                if(ifo){
                    txt += "MÊS PASSADO";
                } else {
                    txt += "no mês passado";
                }
                
            } else {//if(mes == 0)
                
                if(!ifo){
                    txt += "há ";
                }
                
                txt += mes;
                
                if(ifo){
                    txt += " MESES ATRÁS";
                } else {
                    txt += " meses atrás";
                }
                
            }//if(mes == 0)
        
        } else if(dg > dt && ag >= at){//if
            
            int day = dg - dt;
            
            if(!ifo){
                txt += "há ";
            }
            
            txt += day;
            
            if(ifo){
                txt += " DIAS ATRÁS";
            } else {
                txt += " dias atrás";
            }
        
        } else if(ifo){//if
            
            txt += "NO FUTURO";
            
        } else {//if
            
            txt += "no futuro";
            
        }//if
        
        return txt;
        
    }//DataLinha(String start, String end)
    
    public String Load(){
        
        final char sep = '-';
        
        String txt = "";
        
        int a = this.dia.getYear();
        int m = this.dia.getMonthValue();
        int d = this.dia.getDayOfMonth();
        
        txt += a;
        txt += sep;
        
        if(m < 10){
            txt += "0";
        }
        
        txt += m;
        txt += sep;
        
        if(d < 10){
            txt += "0";
        }
        
        txt += d;
        
        return txt;
        
    }
    
}