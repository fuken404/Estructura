/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import LOGICA.Usuario;

/**
 *
 * @author Practica
 */
public class Pregunta3 extends javax.swing.JFrame {

    /**
     * Creates new form Pregunta1
     */
    public Pregunta3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnGrpP1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        radBtnObjetiva = new javax.swing.JRadioButton();
        radBtnOptima = new javax.swing.JRadioButton();
        radBtnOriginal = new javax.swing.JRadioButton();
        radBtnPOO = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrvs = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(356, 254));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("<html><b>Pregunta 3.</b><p> ¿Cuál es el significado de POO?<html>");
        lblTitulo.setToolTipText("");

        btnGrpP1.add(radBtnObjetiva);
        radBtnObjetiva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnObjetiva.setText("Programación Objetiva y Orientativa");
        radBtnObjetiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnObjetivaActionPerformed(evt);
            }
        });

        btnGrpP1.add(radBtnOptima);
        radBtnOptima.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnOptima.setText("Programación Óptima");

        btnGrpP1.add(radBtnOriginal);
        radBtnOriginal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnOriginal.setText("Programación Original y Oficial");
        radBtnOriginal.setToolTipText("");

        btnGrpP1.add(radBtnPOO);
        radBtnPOO.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radBtnPOO.setText("Programación Orientada a Objetos");

        btnNext.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNext.setText("SIGUIENTE");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrvs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnPrvs.setText("ANTERIOR");
        btnPrvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrvsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnObjetiva)
                    .addComponent(radBtnOptima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnPOO)
                    .addComponent(radBtnOriginal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrvs)
                .addGap(27, 27, 27)
                .addComponent(btnNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radBtnObjetiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radBtnOptima))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radBtnPOO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radBtnOriginal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrvs))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        boolean rta = radBtnPOO.isSelected();
        if (rta){
            Usuario.rtas[2] = true;
        }
        Pregunta4 p4 = new Pregunta4();
        p4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextActionPerformed

    private void radBtnObjetivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnObjetivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtnObjetivaActionPerformed

    private void btnPrvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrvsActionPerformed
        // TODO add your handling code here:
        Pregunta2 p2 = new Pregunta2();
        p2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrvsActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpP1;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrvs;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton radBtnObjetiva;
    private javax.swing.JRadioButton radBtnOptima;
    private javax.swing.JRadioButton radBtnOriginal;
    private javax.swing.JRadioButton radBtnPOO;
    // End of variables declaration//GEN-END:variables
}
