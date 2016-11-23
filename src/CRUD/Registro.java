
package CRUD;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alicia Sandoval
 */
public class Registro extends javax.swing.JFrame {

    public static ConsultasBD registro = new ConsultasBD();
    public Registro() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("***PLAYER REGISTRATION***");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ico.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 222, 31));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 222, 28));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 222, 31));

        btnGuardar.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnGuardar.setText("SAVE");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 31));

        btnLimpiar.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnLimpiar.setText("CLEAR");
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 120, 40));

        btnAtras.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnAtras.setText("BACK");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 120, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel5.setText("Enter your information:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 350, 50));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -60, 710, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();;
        String usuario = txtUsername.getText();
        String passs = txtPassword.getText();
        int puntaje=0;
        Boolean nom = false, user = false;
        Boolean pass = false;
        String name = "\n* Nombre";
        String usu = "\n* Usuario", ps = "\n* Contraseña";
        
        if (nombre.compareTo("") != 0) {
            nom = true;
            name = "";
        }
        if (usuario.compareTo("") != 0) {
            user = true;
            usu = "";
        }
        if (passs.compareTo("") != 0) {
            pass = true;
            ps = "";
        }
        
        Boolean pun=true;
        
        boolean valo;
        String us = "";
        Datos buscado = registro.buscarUser(usuario);
        if(buscado != null){
            us = buscado.getUsername();
        }
        //JOptionPane.showMessageDialog(null, us);
        if (nom == true  && user == true && pass == true && pun==true ) {
            if (us.compareTo(usuario) != 0) {
                
                    registro.insertarUsuario(nombre, usuario, passs, puntaje);
                    JOptionPane.showMessageDialog(null, "¡SUCCESSFUL SIGNED !");
                    CRUD abrir = new CRUD();
                    abrir.setVisible(true);
                    this.setVisible(false);
               
            } else {
                JOptionPane.showMessageDialog(null, "THIS USER IS ALREADY REGISTERED");
            }

        } else {
            JOptionPane.showMessageDialog(null, "MISSING INFORMATION" + name  + usu + ps );
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Inicio obj=new Inicio();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
