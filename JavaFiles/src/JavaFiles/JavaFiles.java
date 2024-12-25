/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaFiles;

import file.csv;
import file.cod;

import form.JTable;

import java.time.LocalDate;

/**
 *
 * @author josue
 */
public class JavaFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate arq = LocalDate.now();
        
        final int d = arq.getDayOfMonth();
        final int m = arq.getMonthValue();
        final int a = arq.getYear();
        
        String title = "";
        
        if(a < 10){
            
            title += "0" + a;
            
        } else {
            
            title += "" + a;
            
        }
        
        title += "-";
        
        if(m < 10){
            
            title += "0" + m;
            
        } else {
            
            title += "" + m;
            
        }
        
        title += "-";
        
        if(d < 10){
            
            title += "0" + d;
            
        } else {
            
            title += "" + d;
            
        }
        
        csv verificar = new csv(title);
        cod Action = new cod();
        
        //verificar.Truncate();
        
        String[] dados = {Action.Date(false),Action.Time(false)};
        verificar.Insert(dados);
        
        JTable table = new JTable();
        table.Enter(verificar);
        
    }//main(String[] args)
    
}//Class