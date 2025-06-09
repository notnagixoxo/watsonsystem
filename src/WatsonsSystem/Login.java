/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WatsonsSystem;

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

    /**
     * Creates new form StartFrame
     */
    public Login() {
        initComponents();
        progbar.setVisible(false);
            
        studentEmail.put("heinzfrancisco@gmail.com", "Heinz Karl Francisco");
         studentEmail.put("antoinettecuritana@gmail.com", "Maria Antoinette Curitana");
          studentEmail.put("sophiasayaman@gmail.com", "Sophia Sayaman");
           studentEmail.put("jeillianpereyra@gmail.com", "Jeillian Pereyra");
       

    }

    /*
    This is the Login Form where the user will type his/her ID number to access the Bulldogs Exchange Commerce 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progbar = new javax.swing.JProgressBar();
        idnumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        invalid = new javax.swing.JLabel();
        confirm1 = new javax.swing.JButton();
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

        idnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idnumber.setForeground(new java.awt.Color(0, 51, 102));
        idnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 370, 180, 30));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Email Address");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 352, 180, 20));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONS LAYOUT (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//The event triggered when clicking the "Confirm" button.
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // Get the entered ID number
        String idnumber1 = idnumber.getText();

        // Get the current date and format it as "yyyy-MM-dd"
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Check if the entered ID number exists in the array
        if ( studentEmail.containsKey(idnumber1)) {
            String studentName =  studentEmail.get(idnumber1); // Get student name

            // Store the current date and student number in CartManager
            CartManager.setDate(formattedDate);
            CartManager.setStudentNumber(idnumber1);

            // Show progress bar and disable button
            progbar.setVisible(true);
            confirm.setEnabled(false);

            // Use SwingWorker to update the progress bar
            SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                @Override
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i <= 100; i += 5) { // Increase progress step by step
                        Thread.sleep(100); // Simulate loading delay
                        publish(i); // Update progress bar
                    }
                    return null;
                }

                @Override
                protected void process(List<Integer> chunks) {
                    for (int value : chunks) {
                        progbar.setValue(value); // Set progress bar value
                    }
                }

                @Override
                protected void done() {
                    JOptionPane.showMessageDialog(null, "Welcome, " + studentName + "!"); // Show welcome message
                    // Open the MainForm and close the current form
                    MainForm mf = new MainForm();
                    mf.setVisible(true);
                    dispose();
                }
            };

            worker.execute(); // Start the progress animation
        } else {
            // Display an error message and clear the input field if the ID is invalid
            invalid.setText("Invalid Email!");
            idnumber.setText("");

        }    }//GEN-LAST:event_confirmActionPerformed

    private void confirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm1ActionPerformed

    }//GEN-LAST:event_confirm1ActionPerformed

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
    private javax.swing.JTextField idnumber;
    private javax.swing.JLabel invalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar progbar;
    // End of variables declaration//GEN-END:variables
}
