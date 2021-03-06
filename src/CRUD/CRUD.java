
package CRUD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alicia Sandoval
 */
public class CRUD extends javax.swing.JFrame {
    
    public static Datos jugador;
    public static ConsultasBD registros = new ConsultasBD();
    public static boolean enter = true;
    public static int  nivel ;
    public CRUD() {
        initComponents();      
       
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("***LOG IN***");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ico.png")).getImage());
    }

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClear.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 140, 30));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(200, 21));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 138, -1, 30));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsername.setPreferredSize(new java.awt.Dimension(200, 21));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 30));

        btnAceptar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnAceptar.setText("OK");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 140, 40));

        lbName.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lbName.setText("Name:");
        getContentPane().add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lbPass.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lbPass.setText("Password:");
        getContentPane().add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbTitle.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        lbTitle.setText("Enter your information:");
        getContentPane().add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 350, 50));

        btnBack.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesion.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 590, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String Username = txtUsername.getText();
        String Password = txtPassword.getText();
        boolean a = false, b = false;
        String nm = "\n* Username", ps = "\n* Contraseña";
        if (Username.compareTo("") != 0) {
            a = true;
            nm = "";
        }
        if (Password.compareTo("") != 0) {
            b = true;
            ps = "";
        }

        if (a == true && b == true) {
            Datos buscado = registros.buscarUser(Username);
            if (buscado != null) {
                String pass = buscado.getPassword();
                if (Password.compareTo(pass) == 0) {
                    JOptionPane.showMessageDialog(null, "Logged");
                    enter = false;
                    jugador = buscado;
                    nivel= jugador.getPuntaje();
                    Menu abrir = new Menu();
                    abrir.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Information");
                    enter = false;
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "This user doesn't exist");
                enter = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Need" + nm + ps);
            enter = false;
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        LimpiarCajas();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Inicio obj=new Inicio();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    public void LimpiarCajas() {
    
        txtUsername.setText(null);
        txtPassword.setText(null);
        txtPassword.setEditable(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
