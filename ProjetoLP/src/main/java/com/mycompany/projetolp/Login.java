/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetolp;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    String cadastro[][] = new String[10][3];
    int i = 0, x = 0;
   

    /**
     * Creates new form cadastro
     */
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarestado = new javax.swing.JTextField();
        cadastrarcidade = new javax.swing.JTextField();
        cadastrarnome = new javax.swing.JTextField();
        jLabelnome = new javax.swing.JLabel();
        jLabelcidade = new javax.swing.JLabel();
        jLabelestado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setUndecorated(true);

        cadastrarestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarestadoActionPerformed(evt);
            }
        });
        cadastrarestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarestadoKeyPressed(evt);
            }
        });

        cadastrarcidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarcidadeKeyPressed(evt);
            }
        });

        cadastrarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarnomeActionPerformed(evt);
            }
        });
        cadastrarnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarnomeKeyPressed(evt);
            }
        });

        jLabelnome.setText("NOME");

        jLabelcidade.setText("CIDADE");

        jLabelestado.setText("ESTADO");

        jButton2.setText("SALVAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("IMPRIMIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Julio\\OneDrive\\Área de Trabalho\\fffff.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarnome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelestado)
                            .addComponent(jLabelcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cadastrarestado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(cadastrarcidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabelnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastrarnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelcidade)
                        .addGap(2, 2, 2)
                        .addComponent(cadastrarcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelestado)
                        .addGap(4, 4, 4)
                        .addComponent(cadastrarestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cadastrarnome.requestFocus();
        if (cadastrarnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe seu nome.");
            cadastrarnome.requestFocus();
            cadastrarnome.setForeground(Color.red);
            jLabelnome.setForeground(Color.red);

        } else if (cadastrarcidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe sua cidade.");
            cadastrarcidade.requestFocus();
            cadastrarcidade.setForeground(Color.red);
            jLabelcidade.setForeground(Color.red);

        } else if (cadastrarestado.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe seu estado.");
            cadastrarestado.requestFocus();
            cadastrarestado.setForeground(Color.red);
            jLabelestado.setForeground(Color.red);

        }else {
            cadastro[i][x] = cadastrarnome.getText();
            x++;
            cadastro[i][x] = cadastrarcidade.getText();
            x++;
            cadastro[i][x] = cadastrarestado.getText();
            x = 0;
            i++;
            JOptionPane.showMessageDialog(this, "Cadastramento feito!");
            cadastrarnome.setText(null);
            cadastrarcidade.setText(null);
            cadastrarestado.setText(null);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cadastrarestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarestadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          String todos_cadastros = " ";
        for (i = 0; i < cadastro.length; i++) {
            for (x = 0; x < 3; x++) {
                todos_cadastros += cadastro[i][x];
                todos_cadastros += "  ";
            }
            todos_cadastros += "\n";
        }
        JOptionPane.showMessageDialog(null, todos_cadastros);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cadastrarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarnomeActionPerformed

    private void cadastrarnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarnomeKeyPressed

    }//GEN-LAST:event_cadastrarnomeKeyPressed

    private void cadastrarcidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarcidadeKeyPressed
        
    }//GEN-LAST:event_cadastrarcidadeKeyPressed

    private void cadastrarestadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarestadoKeyPressed

    }//GEN-LAST:event_cadastrarestadoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cadastrarcidade;
    private javax.swing.JTextField cadastrarestado;
    private javax.swing.JTextField cadastrarnome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelcidade;
    private javax.swing.JLabel jLabelestado;
    private javax.swing.JLabel jLabelnome;
    // End of variables declaration//GEN-END:variables
}
