/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WatsonsSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
// Ensure these are already present from your existing code:
import Cart.CartManager;
import MainForms.MainForm;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Ryoji Lagaras
 */
public class Login extends javax.swing.JFrame {

    Map<String, String> studentEmail = new HashMap<>();
      private static final String DbName = "watsonoop"; // The name of your database
    private static final String DbDriver = "com.mysql.cj.jdbc.Driver"; // JDBC driver class
    private static final String DbUrl = "jdbc:mysql://localhost:3306/" + DbName; // Database URL
    private static final String DbUsername = "root"; // Your MySQL username
    private static final String DbPassword = ""; // Your MySQL password (empty if none)

    /**
     * Creates new form StartFrame
     */
    public Login() {
        initComponents();
        progbar.setVisible(false);
            
      

    }
    

    /*
    This is the Login Form where the user will type his/her ID number to access the Bulldogs Exchange Commerce 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progbar = new javax.swing.JProgressBar();
        usergmail = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        invalid = new javax.swing.JLabel();
        confirm1 = new javax.swing.JButton();
        userp = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progbar.setBackground(new java.awt.Color(51, 255, 255));
        progbar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        progbar.setBorderPainted(false);
        progbar.setOpaque(true);
        progbar.setStringPainted(true);
        getContentPane().add(progbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 413, -1));

        usergmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usergmail.setForeground(new java.awt.Color(0, 51, 102));
        usergmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(usergmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 180, 30));

        confirm.setBackground(new java.awt.Color(0, 204, 204));
        confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm.setForeground(new java.awt.Color(0, 51, 102));
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 420, -1, -1));

        invalid.setForeground(new java.awt.Color(255, 255, 51));
        invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, 20));

        confirm1.setBackground(new java.awt.Color(255, 204, 51));
        confirm1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm1.setForeground(new java.awt.Color(0, 51, 102));
        confirm1.setText("CONFIRM");
        confirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm1ActionPerformed(evt);
            }
        });
        getContentPane().add(confirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 420, -1, -1));

        userp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpActionPerformed(evt);
            }
        });
        getContentPane().add(userp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 180, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GMAIL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONS LAYOUT (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//The event triggered when clicking the "Confirm" button.

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
String enteredGmail = usergmail.getText(); // Get Gmail from the JTextField named 'usergmail'
        String enteredPassword = new String(userp.getPassword()); // Get password from the JPasswordField named 'userp'

        // Input validation: Check if both fields are filled
        if (enteredGmail.isEmpty() || enteredPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both Gmail and Password.");
            return; // Stop execution if fields are empty
        }

        Connection con = null; // Declare Connection object
        PreparedStatement pstmt = null; // Declare PreparedStatement object
        ResultSet rs = null; // Declare ResultSet object

        try {
            // Load the JDBC driver
            Class.forName(DbDriver);
            // Establish a connection to the database
            con = DriverManager.getConnection(DbUrl, DbUsername, DbPassword);

            // SQL query to check if the entered Gmail and password exist in the 'accountdetails' table
            // IMPORTANT: Make sure your table name is 'accountdetails' and columns are 'gmail' and 'password'
            String query = "SELECT COUNT(*) FROM accountdetails WHERE gmail = ? AND password = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, enteredGmail); // Set the first parameter (gmail)
            pstmt.setString(2, enteredPassword); // Set the second parameter (password)

            // Execute the query
            rs = pstmt.executeQuery();

            if (rs.next()) { // Move the cursor to the first row of the result set
                int count = rs.getInt(1); // Get the count of matching rows

                if (count > 0) {
                    // Login Successful!
                    LocalDate currentDate = LocalDate.now();
                    String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    CartManager.setDate(formattedDate);
                    CartManager.setStudentNumber(enteredGmail); // Use Gmail as the identifier for the session

                    progbar.setVisible(true);
                    confirm.setEnabled(false);

                    SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            for (int i = 0; i <= 100; i += 5) {
                                Thread.sleep(100);
                                publish(i);
                            }
                            return null;
                        }

                        @Override
                        protected void process(List<Integer> chunks) {
                            for (int value : chunks) {
                                progbar.setValue(value);
                            }
                        }

                        @Override
                        protected void done() {
                            JOptionPane.showMessageDialog(null, "Welcome, " + enteredGmail + "!");
                            MainForm mf = new MainForm();
                            mf.setVisible(true);
                            dispose(); // Close the Login form
                        }
                    };
                    worker.execute();

                } else {
                    // Login Failed: No matching Gmail and password found
                    invalid.setText("Invalid Gmail or Password!");
                    usergmail.setText(""); // Clear Gmail field
                    userp.setText(""); // Clear password field
                }
            }

        } catch (ClassNotFoundException ex) {
            // Handle JDBC driver not found error
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "JDBC Driver not found.", ex);
            JOptionPane.showMessageDialog(this, "Error: JDBC Driver not found. Ensure MySQL Connector is in classpath.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            // Handle SQL database errors
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Database access error.", ex);
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close database resources to prevent leaks
            try {
                if (rs != null) rs.close(); // Close ResultSet
                if (pstmt != null) pstmt.close(); // Close PreparedStatement
                if (con != null) con.close(); // Close Connection
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Error closing database resources.", ex);
            }
        

        }    }//GEN-LAST:event_confirmActionPerformed

    private void confirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm1ActionPerformed
  
    }//GEN-LAST:event_confirm1ActionPerformed

    private void userpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JButton confirm1;
    private javax.swing.JLabel invalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar progbar;
    private javax.swing.JTextField usergmail;
    private javax.swing.JPasswordField userp;
    // End of variables declaration//GEN-END:variables
}
