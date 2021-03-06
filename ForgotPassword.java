
package book_management;

import static book_management.Sign_In.tfUserName;
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

/**
 *
 * @author tuan.nguyen1
 */
public class ForgotPassword extends javax.swing.JFrame {
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private ResultSetMetaData resultSetMetaData;
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() throws SQLException {
        setTitle("Forgot Password");
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

        jLabel2 = new javax.swing.JLabel();
        EnterUser = new javax.swing.JTextField();
        enterEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ok = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, -1));
        getContentPane().add(EnterUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, 30));
        getContentPane().add(enterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, -1));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(new java.awt.Color(238, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok.setBackground(new java.awt.Color(0, 204, 204));
        ok.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 30));

        btExit.setBackground(new java.awt.Color(0, 204, 204));
        btExit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 255, 255));
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel1.add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 30));

        back.setBackground(new java.awt.Color(0, 204, 204));
        back.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 250));

        jPanel2.setBackground(new java.awt.Color(197, 239, 247));

        Title.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 0, 0));
        Title.setText("Forgot password");
        jPanel2.add(Title);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String userName(){
        return EnterUser.getText();
    }
    
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
            String user = EnterUser.getText();
            String email =enterEmail.getText();
            String sql = "SELECT User_Name, Email from User";
            try {
                this.statement = this.connection.prepareStatement(sql);
                ResultSet resultSet = this.statement.executeQuery(sql);
                int count = 0;
                while (resultSet.next()){
                    if (resultSet.getString("User_Name").equals(user) && resultSet.getString("Email").equals(email)) {
                        count=1;
                        break;
                    }
                }
                if(count ==1){
                                         
                        Change_Password change;
                    
                        change = new Change_Password();
                        change.setVisible(true);
                        change.pack();
                        change.setLocationRelativeTo(null);
                        change.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Your User Or  Email didn't exist ! ", "Error", JOptionPane.ERROR_MESSAGE);
                     
                }
            }catch (SQLException ex) {
                Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_okActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        int  a = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
       
    }//GEN-LAST:event_btExitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            Sign_In sign = new Sign_In();
            sign.setVisible(true);
            sign.setLocationRelativeTo(null);
            this.dispose();
            this.pack();
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ForgotPassword().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField EnterUser;
    private static javax.swing.JLabel Title;
    private javax.swing.JButton back;
    private javax.swing.JButton btExit;
    private javax.swing.JTextField enterEmail;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
