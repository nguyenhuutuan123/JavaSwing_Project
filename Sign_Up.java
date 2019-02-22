/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_management;
import Main_Screen.Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author tuan.nguyen1
 */
public class Sign_Up extends javax.swing.JFrame {
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private ResultSetMetaData resultSetMetaData;
    /**
     * Creates new form Sign_Up
     */
    public Sign_Up() throws SQLException {
        setTitle("Student Management");
        try{
            // Tao truy cap cho driver 
            Class.forName("com.mysql.jdbc.Driver");
            // Tao lenh truy cap den co so du lieu
            connection = DriverManager.getConnection( "jdbc:mysql://localhost/Book_Menagement_Project?user=root&password=");
             
            
            // De new mot cau lenh
            statement = connection.createStatement();
             initComponents();
             //hienthibang();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Regester = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        tfFullName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfConfirmpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(197, 239, 247));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Sign Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 80));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        Regester.setBackground(new java.awt.Color(51, 255, 255));
        Regester.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Regester.setText("Register");
        Regester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegesterActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Click here to Login");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        tfConfirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConfirmpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Regester)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfConfirmpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(tfFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(tfUserName)
                                    .addComponent(tfPassword)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7))
                    .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfConfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regester, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 520, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public  int dinhDangEmail(String Email){
        Pattern pt1=Pattern.compile(".+@.+\\.[a-zA-Z]+");
              Matcher mc1=pt1.matcher(Email);
           if(!mc1.find())     {        
             return 1;  
              }
        return 0;
   }
    
    private void RegesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegesterActionPerformed
        String Password= new String(tfPassword.getPassword());
        String Confirm=new String (tfConfirmpassword.getPassword());
        String email= tfEmail.getText();
        String user = tfUserName.getText();
        
        if(tfFullName.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane,"You must enter Full Name","Error",JOptionPane.ERROR_MESSAGE);
           tfFullName.requestFocus();
        }
        else if(tfUserName.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane,"You must enter User Name","Error",JOptionPane.ERROR_MESSAGE);
           tfUserName.requestFocus();
        }
        else if(tfEmail.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane,"You must enter Email", "Error", JOptionPane.ERROR_MESSAGE);
           tfEmail.requestFocus();
        }
        else if(dinhDangEmail(email)==1){
           JOptionPane.showMessageDialog(rootPane," Please enter correct email ");
                  tfEmail.requestFocus();
        }
        else if(Password.equals("")){
           JOptionPane.showMessageDialog(rootPane, "You must enter Password", "Error", JOptionPane.ERROR_MESSAGE); 
           tfPassword.requestFocus();
        }
        else if(!Confirm.equals(Password)||Confirm.equals("")){
        JOptionPane.showMessageDialog(rootPane, "Confirm Password", "Error", JOptionPane.ERROR_MESSAGE);
        tfConfirmpassword.requestFocus();
        }else if( countCharacters(Password)==1){
           JOptionPane.showMessageDialog(rootPane, "You must enter more 5 characters ! ", "Error", JOptionPane.ERROR_MESSAGE);
           tfPassword.requestFocus();
        }else if(checkEmail( email)==1){
           JOptionPane.showMessageDialog(rootPane, "This email existed ! ", "Error", JOptionPane.ERROR_MESSAGE);
           tfEmail.requestFocus();
        }else if( checkUser( user)==1){
           JOptionPane.showMessageDialog(rootPane, "This password existed ! ", "Error", JOptionPane.ERROR_MESSAGE);
           tfUserName.requestFocus();
        } else {
            try {
                    statement.executeUpdate("Insert into User values("+"default,'"+
                    tfFullName.getText()+"','"
                    +tfUserName.getText()+"','"
                    +tfEmail.getText()+"','"
                    +new String(tfPassword.getPassword())+"'"+")");
            
                    JOptionPane.showMessageDialog(rootPane,"Sign in successful");
                    
            } catch (SQLException ex) {
                Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
            }
       }   
    }//GEN-LAST:event_RegesterActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int  a = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            Sign_In sign = new Sign_In();
            sign.setVisible(true);
            sign.setLocationRelativeTo(null);
            this.dispose();
            this.pack();
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tfConfirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConfirmpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConfirmpasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tfConfirmpassword.setText("");
        tfEmail.setText("");
        tfFullName.setText("");
        tfPassword.setText("");
        tfUserName.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

     public static  int  countCharacters(String pass){
    char [] arr = pass.toCharArray();
    for(int i : arr){
       if(arr.equals(" ") || arr.length<=5){
        return 1;     
       }
       break;
       }
    return 0;
   }
    
    public int checkEmail(String Email){
        String email = tfEmail.getText();
        String sql = "SELECT  Email from User";
            try {
                this.statement = this.connection.prepareStatement(sql);
                ResultSet resultSet = this.statement.executeQuery(sql);
                int count = 0;
                while (resultSet.next()){
                    if (resultSet.getString("Email").equals(email)) {
                        count=1;
                        if(count == 1){
                            return 1;
                        }
                        break;
                    }
                }
            }catch (SQLException ex) {
                Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
    }
    
    
    public int checkUser(String User) {
        String user = tfUserName.getText();
        String sql = "SELECT  User_Name from User";
            try {
                this.statement = this.connection.prepareStatement(sql);
                ResultSet resultSet = this.statement.executeQuery(sql);
                int count = 0;
                while (resultSet.next()){
                    if (resultSet.getString("User_Name").equals(user)) {
                        count=1;
                        if(count == 1){
                            return 1;
                        }
                        break;
                    }
                }
            }catch (SQLException ex) {
                Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Sign_Up().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regester;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField tfConfirmpassword;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
