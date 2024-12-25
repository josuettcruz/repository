/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import file.csv;
import file.cod;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class JTable extends javax.swing.JFrame {
    
    
    /**
     * Creates new form JTable
     */
    public JTable() {
        
        initComponents();
        
        setVisible(true);
        setLocation(400, 200);
        setResizable(false);
        
        int a = LocalDate.now().getYear();
        int m = LocalDate.now().getMonthValue();
        int d = LocalDate.now().getDayOfMonth();
        int s = LocalDate.now().getDayOfWeek().getValue();
        
        String title = "Hoje é ";
        
        switch(s){
            
            case 1 ->{
                title += "Segunda";
            }
            
            case 2 ->{
                title += "Terça";
            }
            
            case 3 ->{
                title += "Quarta";
            }
            
            case 4 ->{
                title += "Quinta";
            }
            
            case 5 ->{
                title += "Sexta";
            }
            
            case 6 ->{
                title += "Sábado";
            }
            
            case 7 ->{
                title += "Domingo";
            }
            
        }//switch(tara.getDayOfWeek().getValue())
        
        if(s <= 6){
            title += "-feira";
        }
        title += ", dia ";
            
        title += d;
        
        if(d == 1){
            
            title += "º";
            
        }//if(d < 10)
        
        title += " de ";
        
        switch(m){
            
            case 1 ->{
                title += "Janeiro";
            }
            
            case 2 ->{
                title += "Fevereiro";
            }
            
            case 3 ->{
                title += "Março";
            }
            
            case 4 ->{
                title += "Abril";
            }
            
            case 5 ->{
                title += "Maio";
            }
            
            case 6 ->{
                title += "Junho";
            }
            
            case 7 ->{
                title += "Julho";
            }
            
            case 8 ->{
                title += "Agosto";
            }
            
            case 9 ->{
                title += "Setembro";
            }
            
            case 10 ->{
                title += "Outubro";
            }
            
            case 11 ->{
                title += "Novembro";
            }
            
            case 12 ->{
                title += "Dezembro";
            }
            
        }//switch(m)
        
        title += " de ";
        title += a;
        
        setTitle(title);
        
    }//JTable()
    
    private String Data(LocalDate tara){
        
        int a = tara.getYear();
        int m = tara.getMonthValue();
        int d = tara.getDayOfMonth();
        int s = tara.getDayOfWeek().getValue();
        
        String title = "";
        
        switch(s){
            
            case 1 ->{
                title += "Segunda";
            }
            
            case 2 ->{
                title += "Terça";
            }
            
            case 3 ->{
                title += "Quarta";
            }
            
            case 4 ->{
                title += "Quinta";
            }
            
            case 5 ->{
                title += "Sexta";
            }
            
            case 6 ->{
                title += "Sábado";
            }
            
            case 7 ->{
                title += "Domingo";
            }
            
        }//switch(tara.getDayOfWeek().getValue())
        
        if(s <= 6){
            title += "-feira";
        }
        title += ", dia ";
            
        title += d;
        
        if(d == 1){
            
            title += "º";
            
        }//if(d < 10)
        
        title += " de ";
        
        switch(m){
            
            case 1 ->{
                title += "Janeiro";
            }
            
            case 2 ->{
                title += "Fevereiro";
            }
            
            case 3 ->{
                title += "Março";
            }
            
            case 4 ->{
                title += "Abril";
            }
            
            case 5 ->{
                title += "Maio";
            }
            
            case 6 ->{
                title += "Junho";
            }
            
            case 7 ->{
                title += "Julho";
            }
            
            case 8 ->{
                title += "Agosto";
            }
            
            case 9 ->{
                title += "Setembro";
            }
            
            case 10 ->{
                title += "Outubro";
            }
            
            case 11 ->{
                title += "Novembro";
            }
            
            case 12 ->{
                title += "Dezembro";
            }
            
        }//switch(m)
        
        title += " de ";
        title += a;
        
        return title;
        
    }//Data(LocalDate tara)
    
    public void Enter(csv cod){
        
        final String[] modelo = {"0001", "0002"};
        DefaultTableModel tela = new DefaultTableModel(modelo, 0);
        
        if(cod.Tot() >= 0){
            
            for(int i = cod.Tot()-1; i >= 0; i--){
                
                cod dg = new cod();
                
                dg.Date(cod.Read(i, 0));
                dg.Time(cod.Read(i, 1));
                
                String[] dados = {Data(dg.getData()),dg.Time(true)};
                tela.addRow(dados);
                
                if(i < cod.Tot()-20){
                    
                    String[] code = {"...", "..."};
                    tela.addRow(code);
                    break;
                    
                }//if(i < csv.Tot()-5)
                
            }//for(int i = 0; i < csv.Tot(); i++)
            
            tabel.setModel(tela);
            
        }//if(csv.Tot() >= 0)
        
    }//Enter()

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
