/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.examen4tosemestre;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
/**
 *
 * @author HP}
 */


public class ejercicio extends javax.swing.JFrame {
    
    private JTextField[] textfields = new JTextField[9];
    private int[] numeros = new int[9];
    /**
     * Creates new form ejercicio
     */
    
    private boolean comprobar(){
        for (int i = 0; i < 9; i++){
            if (numeros[i] == 0){
                return false;
            }
        }
        return true;
    }
    
    private boolean checarrepeticiones(int num){
        for (int i = 0; i < 9; i++){
            if (num == numeros[i]){
                return true;
            }
        }
        return false;
    }
    
    private void hacercalculos(){
        boolean magico = true;
        
        // diagonal arriba
        int suma = 0;
        for (int i = 2; i<=6; i += 2){
            suma += numeros[i];
        }
        res1.setText(""+suma);
        if (suma > 15 || suma < 15){
            res1.setForeground(Color.red);
            magico = false;
        }else{
            res1.setForeground(Color.green);
        }
        // fila 1
        suma = 0;
        for (int i = 0; i<=2; i++){
            suma += numeros[i];
        }
        res2.setText("=  "+suma);
        if (suma > 15 || suma < 15){
            res2.setForeground(Color.red);
            magico = false;
        }else{
            res2.setForeground(Color.green);
        }
        // fila 2
        suma = 0;
        for (int i = 3; i<=5; i++){
            suma += numeros[i];
        }
        res3.setText("=  "+suma);
        if (suma > 15 || suma < 15){
            res3.setForeground(Color.red);
            magico = false;
        }else{
            res3.setForeground(Color.green);
        }
        // fila 3
        suma = 0;
        for (int i = 6; i<=8; i++){
            suma += numeros[i];
        }
        res4.setText("=  "+suma);
        if (suma > 15 || suma < 15){
            res4.setForeground(Color.red);
            magico = false;
        }else{
            res4.setForeground(Color.green);
        }
        // diagonal abajo
        suma = 0;
        for (int i = 0; i<=8; i+=4){
            suma += numeros[i];
        }
        res5.setText(""+suma);
        if (suma > 15 || suma < 15){
            res5.setForeground(Color.red);
            magico = false;
        }else{
            res5.setForeground(Color.green);
        }
        // columna 3
        suma = 0;
        for (int i = 2; i<=8; i+=3){
            suma += numeros[i];
        }
        res6.setText(""+suma);
        if (suma > 15 || suma < 15){
            res6.setForeground(Color.red);
            magico = false;
        }else{
            res6.setForeground(Color.green);
        }
        // columna 2
        suma = 0;
        for (int i = 1; i<=7; i+=3){
            suma += numeros[i];
        }
        res7.setText(""+suma);
        if (suma > 15 || suma < 15){
            res7.setForeground(Color.red);
            magico = false;
        }else{
            res7.setForeground(Color.green);
        }
        // columna 1
        suma = 0;
        for (int i = 0; i<=6; i+=3){
            suma += numeros[i];
        }
        res8.setText(""+suma);
        if (suma > 15 || suma < 15){
            res8.setForeground(Color.red);
            magico = false;
        }else{
            res8.setForeground(Color.green);
        }
        
        
        if (magico == true){
            resulttext.setText("El cubo es magico!");
        }else{
            resulttext.setText("El cubo no es magico!");
        }
    }
    
    public ejercicio() {
        initComponents();
        
        textfields[0] = box1;
        textfields[1] = box2;
        textfields[2] = box3;
        textfields[3] = box4;
        textfields[4] = box5;
        textfields[5] = box6;
        textfields[6] = box7;
        textfields[7] = box8;
        textfields[8] = box9;
        
        for (int i = 0;i<9;i++){
            JTextField field = textfields[i];
            
            field.putClientProperty("Id",i);
            
            field.addFocusListener(new FocusListener() {
               @Override
               public void focusGained(FocusEvent e) {}

               @Override
               public void focusLost(FocusEvent e) {
                   int num = 0;
                   try {
                       num = Integer.parseInt(field.getText());
                   }catch(Exception ex){}
                   if (field.getText().equals("")){
                       return;
                   }
                   if (num <= 0 || num > 9){
                       field.setText("");
                       JOptionPane.showMessageDialog(null, "El numero debe ser mayor de 0 a 9 y valido!");
                   }else {
                       if (checarrepeticiones(num) == true){
                           field.setText("");
                           JOptionPane.showMessageDialog(null, "Los numeros no pueden repetir!");
                       }
                       numeros[(int)field.getClientProperty("Id")] = num;
                   }
               }
           });
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box1 = new javax.swing.JTextField();
        box4 = new javax.swing.JTextField();
        box7 = new javax.swing.JTextField();
        box2 = new javax.swing.JTextField();
        box5 = new javax.swing.JTextField();
        box8 = new javax.swing.JTextField();
        box9 = new javax.swing.JTextField();
        box6 = new javax.swing.JTextField();
        box3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        res7 = new javax.swing.JLabel();
        res3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        res4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        res8 = new javax.swing.JLabel();
        res6 = new javax.swing.JLabel();
        res2 = new javax.swing.JLabel();
        res1 = new javax.swing.JLabel();
        res5 = new javax.swing.JLabel();
        resolverBtn = new javax.swing.JButton();
        resulttext = new javax.swing.JLabel();
        resetearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        box1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });

        box6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        box3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("EXAMEN EXTRAORDINARIO");

        res7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        res7.setText("0");

        res3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res3.setText("=  0");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("||");

        res4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res4.setText("=  0");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("||");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("||");

        res8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        res8.setText("0");

        res6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        res6.setText("0");

        res2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res2.setText("=  0");

        res1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res1.setText("0");

        res5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        res5.setText("0");

        resolverBtn.setBackground(new java.awt.Color(0, 204, 153));
        resolverBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        resolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        resolverBtn.setText("RESOLVER");
        resolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });

        resulttext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resulttext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resulttext.setText("..");

        resetearBtn.setBackground(new java.awt.Color(153, 153, 153));
        resetearBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        resetearBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetearBtn.setText("RESETEAR");
        resetearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(res8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(res7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(res2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(res3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(res4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(res6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(res5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(res1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resulttext, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(res1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(res7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(res5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resulttext)
                .addGap(18, 18, 18)
                .addComponent(resolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetearBtn)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box9ActionPerformed

    private void resolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolverBtnActionPerformed
        boolean valido = comprobar();
        if(valido != true){
            JOptionPane.showMessageDialog(null, "Algunos campos siguen vacio");
            return;
        }
        hacercalculos();
    }//GEN-LAST:event_resolverBtnActionPerformed

    private void resetearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetearBtnActionPerformed
        for (int i = 0; i < 9; i++){
            textfields[i].setText("");
            numeros[i] = 0;
        }
        res1.setText("0");
        res1.setForeground(Color.black);
        res2.setText("=  0");
        res2.setForeground(Color.black);
        res3.setText("=  0");
        res3.setForeground(Color.black);
        res4.setText("=  0");
        res4.setForeground(Color.black);
        res5.setText("0");
        res5.setForeground(Color.black);
        res6.setText("0");
        res6.setForeground(Color.black);
        res7.setText("0");
        res7.setForeground(Color.black);
        res8.setText("0");
        res8.setForeground(Color.black);
        resulttext.setText("...");
    }//GEN-LAST:event_resetearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box1;
    private javax.swing.JTextField box2;
    private javax.swing.JTextField box3;
    private javax.swing.JTextField box4;
    private javax.swing.JTextField box5;
    private javax.swing.JTextField box6;
    private javax.swing.JTextField box7;
    private javax.swing.JTextField box8;
    private javax.swing.JTextField box9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel res1;
    private javax.swing.JLabel res2;
    private javax.swing.JLabel res3;
    private javax.swing.JLabel res4;
    private javax.swing.JLabel res5;
    private javax.swing.JLabel res6;
    private javax.swing.JLabel res7;
    private javax.swing.JLabel res8;
    private javax.swing.JButton resetearBtn;
    private javax.swing.JButton resolverBtn;
    private javax.swing.JLabel resulttext;
    // End of variables declaration//GEN-END:variables
}
