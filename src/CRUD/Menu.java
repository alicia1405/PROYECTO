/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Alicia Sandoval
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        
       initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("***MENU***");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ico.png")).getImage());
         inicio();
    }

    public void inicio(){
    Username.setText(CRUD.jugador.getUsername());
        Puntaje.setText(Integer.toString(CRUD.jugador.getPuntaje()));
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lIma = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lNivel = new javax.swing.JLabel();
        lUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBas = new javax.swing.JComboBox();
        btnSalir1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Username = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Puntaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jInter = new javax.swing.JComboBox();
        jAvan = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        lIma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel1.setText("Choose a Game:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 288, -1));

        jBas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hanged Person", "Memo" }));
        jBas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBasItemStateChanged(evt);
            }
        });
        jBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBasActionPerformed(evt);
            }
        });
        getContentPane().add(jBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        btnSalir1.setText("LOGOUT");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 140, 34));

        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(Username);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 83, 25));

        Puntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane2.setViewportView(Puntaje);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 83, 25));

        jLabel2.setText("Welcome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 75, 25));

        jLabel3.setText("Accumulated Score");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 110, 25));

        jInter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hanged Person", "Memo" }));
        jInter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jInterItemStateChanged(evt);
            }
        });
        jInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInterActionPerformed(evt);
            }
        });
        getContentPane().add(jInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jAvan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hanged Person", "Memo" }));
        jAvan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jAvanItemStateChanged(evt);
            }
        });
        jAvan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvanActionPerformed(evt);
            }
        });
        getContentPane().add(jAvan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("BASIC:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("INTERMEDIATE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("ADVANCED:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/globos.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -220, 710, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBasActionPerformed
        if(jBas.getSelectedIndex() == 0){
        Ahorcado ok = new Ahorcado ();
        ok.setVisible(true);
        this.setVisible(false); 
        }if(jBas.getSelectedIndex() == 1){
        Memorama ok = new Memorama ();
        ok.setVisible(true);
        this.setVisible(false); 
        }
    }//GEN-LAST:event_jBasActionPerformed

    private void jBasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBasItemStateChanged
        
        
    }//GEN-LAST:event_jBasItemStateChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        CRUD abrir = new CRUD();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
        CRUD abrir = new CRUD();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jInterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jInterItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jInterItemStateChanged

    private void jInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInterActionPerformed
        if(jInter.getSelectedIndex() == 0){
        Ahorcado1 ok = new Ahorcado1 ();
        ok.setVisible(true);
        this.setVisible(false); 
        }if(jInter.getSelectedIndex() == 1){
        Memorama1 ok = new Memorama1 ();
        ok.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jInterActionPerformed
    }
    private void jAvanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jAvanItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jAvanItemStateChanged

    private void jAvanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvanActionPerformed
        if(jAvan.getSelectedIndex() == 0){
        Ahorcado11 ok = new Ahorcado11 ();
        ok.setVisible(true);
        this.setVisible(false); 
        }if(jAvan.getSelectedIndex() == 1){
        Memorama2 ok = new Memorama2 ();
        ok.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jAvanActionPerformed
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Puntaje;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox jAvan;
    private javax.swing.JComboBox jBas;
    private javax.swing.JComboBox jInter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lIma;
    private javax.swing.JLabel lNivel;
    private javax.swing.JLabel lUsuario;
    // End of variables declaration//GEN-END:variables
}
