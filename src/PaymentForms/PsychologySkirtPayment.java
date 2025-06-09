/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaymentForms;

import WatsonsSystem.GcashSuccessfulPurchaseForm;
import WatsonsSystem.CashSuccessfulPurchaseForm;
import Cart.CartManager;
import SelectedProductBody.Cetaphil;
import SelectedProductConditionr.Pantene;
import SelectedProductShampoo.HeadandShoulders;
import java.awt.CardLayout;

/**
 *
 * @author Ryoji Lagaras
 */
public class PsychologySkirtPayment extends javax.swing.JFrame {

    /**
     * Creates new form PaymentForm
     */
    public PsychologySkirtPayment() {
        initComponents();
        number.setVisible(false);
        lblNumber.setVisible(false);
    }

    /*
     This is the payment form for psychology skirt which allows users to choose their preferred payment method when completing a purchase.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        Confirm1 = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        gcash1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        cash1 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirm1.setBackground(new java.awt.Color(255, 204, 51));
        Confirm1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Confirm1.setForeground(new java.awt.Color(0, 51, 102));
        Confirm1.setText("CONFIRM");
        Confirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm1ActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 518, -1, -1));

        Back1.setBackground(new java.awt.Color(153, 153, 153));
        Back1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Back1.setText("BACK");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        getContentPane().add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 518, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(gcash1);
        gcash1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gcash1.setForeground(new java.awt.Color(255, 204, 51));
        gcash1.setText("GCASH");
        gcash1.setMargin(new java.awt.Insets(10, 2, 3, 2));
        gcash1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcash1ActionPerformed(evt);
            }
        });
        jPanel2.add(gcash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 56, 100, 30));

        jLabel6.setBackground(new java.awt.Color(255, 204, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gcashh.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 40, -1, 64));

        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(153, 153, 153));
        jRadioButton6.setText("CARD");
        jRadioButton6.setContentAreaFilled(false);
        jRadioButton6.setEnabled(false);
        jPanel2.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carddd.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 244, -1, 76));

        jLabel8.setBackground(new java.awt.Color(255, 204, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cash Pickup.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 142, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*Unavailable");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 272, -1, 20));

        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        number.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 60, 131, -1));

        buttonGroup1.add(cash1);
        cash1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cash1.setForeground(new java.awt.Color(255, 204, 51));
        cash1.setText("CASH ON PICKUP");
        cash1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash1ActionPerformed(evt);
            }
        });
        jPanel2.add(cash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 28, -1, -1));

        lblNumber.setForeground(new java.awt.Color(255, 204, 51));
        lblNumber.setText("Number:");
        jPanel2.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 20));

        lblError.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 166, 16));

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 371, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 414, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 583));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gcash1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcashActionPerformed
        lblNumber.setVisible(true);
        number.setVisible(true);
        lblError.setVisible(true);
    }//GEN-LAST:event_gcashActionPerformed

    private void cash1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        lblNumber.setVisible(true);
        number.setVisible(true);
        lblError.setVisible(true);
    }//GEN-LAST:event_cashActionPerformed

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
            if (gcash1.isSelected()) {
                GcashSuccessfulPurchaseForm sf = new GcashSuccessfulPurchaseForm(CartManager.getCartModel());
                sf.setVisible(true);
            } else if (cash1.isSelected()) {
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

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       Pantene bc = new Pantene();
        bc.show();
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void gcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcash1ActionPerformed
        lblNumber.setVisible(true);
        number.setVisible(true);
        lblError.setVisible(true);
    }//GEN-LAST:event_gcash1ActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash1ActionPerformed
        lblNumber.setVisible(true);
        number.setVisible(true);
        lblError.setVisible(true);
    }//GEN-LAST:event_cash1ActionPerformed

    private void Confirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm1ActionPerformed
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
            if (gcash1.isSelected()) {
                GcashSuccessfulPurchaseForm sf = new GcashSuccessfulPurchaseForm(CartManager.getCartModel());
                sf.setVisible(true);
            } else if (cash1.isSelected()) {
                CashSuccessfulPurchaseForm sf = new CashSuccessfulPurchaseForm(CartManager.getCartModel());
                sf.setVisible(true);
            } else {
                lblError.setText("Please select a payment method!");
                return; // Stop execution if no payment method is selected
            }

            // Close current form
            dispose();
        }
    }//GEN-LAST:event_Confirm1ActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        Pantene bc = new Pantene();
        bc.show();
        dispose();
    }//GEN-LAST:event_Back1ActionPerformed

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
            java.util.logging.Logger.getLogger(PsychologySkirtPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PsychologySkirtPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PsychologySkirtPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PsychologySkirtPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PsychologySkirtPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Confirm1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton cash1;
    private javax.swing.JRadioButton gcash1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JTextField number;
    // End of variables declaration//GEN-END:variables
}
