/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publichealthmanagementgui;

import admin.adminDashboard;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userDashboard;

/**
 *
 * @author Administrator
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
    }
    static String status;
    static String type;
    
    public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + username + "' AND u_password = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next()){
                status = resultSet.getString("u_status");
                type = resultSet.getString("u_usertype");
                return true;    
            }else{
                return false;
            }
        }catch (SQLException ex) {
            return false;
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

        Container = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        newuser = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(204, 204, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(153, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PUBLIC HEALTH MANAGEMENT");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 660, 50));

        Container.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 720, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Red Circle Health Logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 50, 420, 230));

        Container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 300, 340));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("LOGIN FORM");
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 180, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setText("USERNAME:");
        Container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 90, 20));

        user.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        Container.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 240, 30));

        pass.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 240, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setText("PASSWORD:");
        Container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 80, 50));

        login.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Container.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 90, 30));

        jButton2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Container.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 90, 30));

        newuser.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        newuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newuser.setText("New User? Click here to Sign Up!");
        newuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newuserMouseClicked(evt);
            }
        });
        Container.add(newuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 230, -1));

        showpass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showpass.setText("Show password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        Container.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 130, -1));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 409));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if(loginAcc(user.getText(), pass.getText())){   
        if(!status.equals("Active")){
            JOptionPane.showMessageDialog(null, "In-Active Account, Contact the ADMIN! ");   
        }else{
            if(type.equals("ADMIN")){  
                 JOptionPane.showMessageDialog(null, "Login Successfully!");
                adminDashboard ads = new adminDashboard();
                ads.setVisible(true);
                this.dispose();   
            }else if(type.equals("USER")){
                 JOptionPane.showMessageDialog(null, "Login Successfully!");
                userDashboard usd = new userDashboard();
                usd.setVisible(true);
                this.dispose();     
            }else{
                JOptionPane.showMessageDialog(null, "No Account Type Found, Contact the ADMIN! ");
            }
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Account!");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void newuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newuserMouseClicked
      registrationForm rfm = new registrationForm();
      rfm.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_newuserMouseClicked

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
           pass.setEchoChar((char)0);
        }
        else {
            pass.setEchoChar('*');
           
        }
    }//GEN-LAST:event_showpassActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Header;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel newuser;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
