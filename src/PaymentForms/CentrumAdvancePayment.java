/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaymentForms;

import WatsonsSystem.GcashSuccessfulPurchaseForm;
import WatsonsSystem.CashSuccessfulPurchaseForm;
import SelectedProductHealth.Centrum;
import Cart.CartManager;
import java.awt.CardLayout;

/**
 *
 * @author Ryoji Lagaras
 */
public class CentrumAdvancePayment extends javax.swing.JFrame {

    /**
     * Creates new form PaymentForm
     */
    public CentrumAdvancePayment() {
        initComponents();
        number.setVisible(false);
        lblNumber.setVisible(false);
    }

    /*
     This is the payment form for duffle bag which allows users to choose their preferred payment method when completing a purchase.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        Back = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        gcash = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        cash = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setBackground(new java.awt.Color(153, 153, 153));
        Back.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 518, -1, -1));

        Confirm.setBackground(new java.awt.Color(255, 204, 51));
        Confirm.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Confirm.setForeground(new java.awt.Color(0, 51, 102));
        Confirm.setText("CONFIRM");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 518, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(gcash);
        gcash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gcash.setForeground(new java.awt.Color(255, 204, 51));
        gcash.setText("GCASH");
        gcash.setMargin(new java.awt.Insets(10, 2, 3, 2));
        gcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcashActionPerformed(evt);
            }
        });
        jPanel1.add(gcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 56, 100, 30));

        jLabel2.setBackground(new java.awt.Color(255, 204, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gcashh.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 40, -1, 64));

        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(153, 153, 153));
        jRadioButton5.setText("CARD");
        jRadioButton5.setContentAreaFilled(false);
        jRadioButton5.setEnabled(false);
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carddd.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 244, -1, 76));

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cash Pickup.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 142, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*Unavailable");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 272, -1, 20));

        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        number.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 60, 131, -1));

        buttonGroup1.add(cash);
        cash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cash.setForeground(new java.awt.Color(255, 204, 51));
        cash.setText("CASH ON PICKUP");
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });
        jPanel1.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 28, -1, -1));

        lblNumber.setForeground(new java.awt.Color(255, 204, 51));
        lblNumber.setText("Number:");
        jPanel1.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 20));

        lblError.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 166, 16));

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 371, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 414, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONS LAYOUT (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 583));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Centrum bc = new Centrum();
        bc.show();
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        String contactNumber = number.getText();

        if (contactNumber.isEmpty()) {
            lblError.setText("Field cannot be empty!");
        } else if (!contactNumber.matches("\\d+")) { // Check if input is NOT a number
            lblError.setText("Only numbers are allowed!");
        } else if (contactNumber.length() != 11) { // Check if not exactly 11 digits
            lblError.setText("Number must be exactly 11 digits!");
        } else {
            // Store contact number in CartManager
            CartManager.setContactNumber(contactNumber);

            // Check which payment method is selected
            if (gcash.isSelected()) {
                GcashSuccessfulPurchaseForm sf = new GcashSuccessfulPurchaseForm(CartManager.getCartModel());
                sf.setVisible(true);
            } else if (cash.isSelected()) {
                CashSuccessfulPurchaseForm sf = new CashSuccessfulPurchaseForm(CartManager.getCartModel());
                sf.setVisible(true);
            } else {
                lblError.setText("Please select a payment method!");
                return; // Stop execution if no payment method is selected
            }

            // Close current form
            dispose();
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void gcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcashActionPerformed
        lblNumber.setVisible(true);
        number.setVisible(true);
        lblError.setVisible(true);
    }//GEN-LAST:event_gcashActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        lblNumber.setVisible(true);
        number.setVisible(true);
        lblError.setVisible(true);
    }//GEN-LAST:event_cashActionPerformed

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
            java.util.logging.Logger.getLogger(CentrumAdvancePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentrumAdvancePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentrumAdvancePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentrumAdvancePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CentrumAdvancePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Confirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton cash;
    private javax.swing.JRadioButton gcash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JTextField number;
    // End of variables declaration//GEN-END:variables
}
