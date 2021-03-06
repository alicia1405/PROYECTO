/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.applet.AudioClip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Alicia Sandoval
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form usuario
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("***WELCOME!!***");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ico.png")).getImage());
        AudioClip sound;
            sound= java.applet.Applet.newAudioClip(getClass().getResource("/CRUD/sound.wav"));
            sound.play();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnInicioSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicioSesion.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnInicioSesion.setText("LOG IN");
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, 90));

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnRegistrarse.setText("SIGN IN");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 260, 90));

        jLabel4.setFont(new java.awt.Font("DFKai-SB", 1, 48)); // NOI18N
        jLabel4.setText("THE POWER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 630, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        CRUD obj=new CRUD();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Registro obj=new Registro();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
