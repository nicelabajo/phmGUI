/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publichealthmanagementgui;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class registrationForm extends javax.swing.JFrame {

    /**
     * Creates new form registrationForm
     */
    public registrationForm() {
        initComponents();
    }
    public static String email, username;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM tbl_user  WHERE u_username = '" +un.getText()+ "' OR u_email = '" +em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    em.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
                    un.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ps = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        cn = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        showpasss = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Container.setBackground(new java.awt.Color(204, 204, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(153, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PUBLIC HEALTH MANAGEMENT");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, 50));

        Container.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Red Circle Health Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 340));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("REGISTRATION FORM");
        Container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 350, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setText("USER TYPE:");
        Container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 90, 20));

        ps.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 240, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setText("PASSWORD:");
        Container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 80, 50));

        reg.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        reg.setText("REGISTER");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        Container.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 110, 20));

        jButton2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Container.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 110, 20));

        fn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        Container.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 240, 30));

        ln.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        Container.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 240, 30));

        em.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        Container.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 240, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setText("FIRSTNAME:");
        Container.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 90, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel6.setText("LASTNAME:");
        Container.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setText("EMAIL:");
        Container.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setText("CONTACT NO#:");
        Container.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 100, 50));

        ut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USER" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        Container.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 240, 30));

        cn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 240, 30));

        un.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Container.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 240, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel10.setText("USERNAME:");
        Container.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, -1));

        showpasss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasssActionPerformed(evt);
            }
        });
        Container.add(showpasss, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        if (fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || cn.getText().isEmpty() || un.getText().isEmpty() || ps.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "All fields are required!");
        } else if (ps.getText().length() < 8) {
           JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.");
           ps.setText(""); 
        } else if (!em.getText().endsWith("@gmail.com")) {
           JOptionPane.showMessageDialog(null, "Invalid email format..");
           em.setText("");
        } else if (!isValidContactNumber(cn.getText())) {
           JOptionPane.showMessageDialog(null, "Contact number must contain only digits and be 10 digits long.");
           cn.setText("");
        } else if (duplicateCheck()) {
           JOptionPane.showMessageDialog(null, "Email is Already Used!");
           em.setText(""); 
        } else {
        dbConnector dbc = new dbConnector();
        if( dbc.insertData("INSERT INTO tbl_user (u_firstname, u_lastname, u_email, u_usertype, u_contact, u_username, u_password, u_status) "
                + "VALUES ('"+fn.getText()+"','"+ln.getText()+"','"+em.getText()+"', '"+ut.getSelectedItem()+"','"+cn.getText()+"','"+un.getText()+"','"+ps.getText()+"','Pending')")){   
        {
            
        }
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            loginForm lfr = new loginForm();
            lfr.setVisible(true);
            this.dispose();
            }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");    
            }
    }
    }
    private boolean isValidContactNumber(String contact) {
    return contact.matches("\\d{10}");
    }//GEN-LAST:event_regActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    loginForm lfm = new loginForm();
    lfm.setVisible(true);
    
    this.dispose();
        




    }//GEN-LAST:event_jButton2ActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void showpasssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasssActionPerformed
        if(showpasss.isSelected()){
           ps.setEchoChar((char)0);       
        }
        else {
            ps.setEchoChar('*');    
        }
    }//GEN-LAST:event_showpasssActionPerformed

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField ps;
    private javax.swing.JButton reg;
    private javax.swing.JCheckBox showpasss;
    private javax.swing.JTextField un;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
