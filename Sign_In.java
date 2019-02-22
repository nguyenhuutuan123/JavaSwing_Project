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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuan.nguyen1
 */
public class Sign_In extends javax.swing.JFrame {

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private ResultSetMetaData resultSetMetaData;
    
    
    public Sign_In() throws SQLException {
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

        Title = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        Sign_In = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        link = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        Forget = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        link1 = new javax.swing.JLabel();
        link2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(255, 0, 0));
        Title.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 0, 0));
        Title.setText("Sign In");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 25, 160, 53));

        lbUser.setBackground(new java.awt.Color(255, 255, 255));
        lbUser.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("User Nạme");
        getContentPane().add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 114, -1, -1));

        lbPassword.setBackground(new java.awt.Color(255, 255, 255));
        lbPassword.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("Password");
        getContentPane().add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 167, -1, -1));
        getContentPane().add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 113, 220, 30));

        Sign_In.setBackground(new java.awt.Color(0, 204, 204));
        Sign_In.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Sign_In.setText("Sign In");
        Sign_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_InActionPerformed(evt);
            }
        });
        getContentPane().add(Sign_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Cencel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 30));

        link.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        link.setForeground(new java.awt.Color(255, 255, 255));
        link.setText("Don' t have an acount !  ");
        getContentPane().add(link, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 26));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("click Sign Up");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, 20));
        getContentPane().add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 220, 30));

        Forget.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Forget.setForeground(new java.awt.Color(51, 255, 255));
        Forget.setText("Forget Password ?");
        Forget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetMouseClicked(evt);
            }
        });
        getContentPane().add(Forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 20));

        jPanel1.setBackground(new java.awt.Color(197, 239, 247));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 430, 270));

        link1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        link1.setText("Don' t have an acount !  ");
        getContentPane().add(link1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 26));

        link2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        link2.setText("Don' t have an acount !  ");
        getContentPane().add(link2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 26));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            // TODO add your handling code here:
            Sign_Up signup = new Sign_Up();
            signup.setVisible(true);
            signup.pack();
            signup.setLocationRelativeTo(null);
            signup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    
    
    private void Sign_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_InActionPerformed
        // Check Pasword da dang ky hany chua    
            String userName = tfUserName.getText();
            String PassWord =new  String(tfPassword.getPassword());
            String sql = "SELECT User_Name, Pass_Word from User";
            try {
                this.statement = this.connection.prepareStatement(sql);
                ResultSet resultSet = this.statement.executeQuery(sql);
                int count = 0;
                while (resultSet.next()){
                    if (resultSet.getString("User_Name").equals(userName) && resultSet.getString("Pass_Word").equals(PassWord)) {
                        count=1;
                        break;
                    }
                }
                if(count ==1){
                    JOptionPane.showMessageDialog(rootPane,"Sign in successful");
                    Home home = new Home();
                    home.setVisible(true);
                    home.pack();
                    home.setLocationRelativeTo(null);
                    home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Your User Or  Password didn't exist ! ", "Error", JOptionPane.ERROR_MESSAGE);
                     
                }
            }catch (SQLException ex) {
                Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_Sign_InActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int  a = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

     
    
    
    private void ForgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseClicked
       
        ForgotPassword forgot;
        try {
            forgot = new ForgotPassword();
            forgot.setVisible(true);
            dispose();
            pack();
            forgot.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ForgetMouseClicked

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
            java.util.logging.Logger.getLogger(Sign_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Sign_In().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Forget;
    private javax.swing.JButton Sign_In;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel link;
    private javax.swing.JLabel link1;
    private javax.swing.JLabel link2;
    private javax.swing.JPasswordField tfPassword;
    public static javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables

    private void prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
