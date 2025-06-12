/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SelectedProductHealth;

import WatsonsSystem.GcashSuccessfulPurchaseForm;
import EditCartTable.amlodipine;
import Cart.CartManager;
import static Cart.CartManager.getCartModel;
import MainForms.HealthForm;
import PaymentForms.AmlodipinePayment;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryoji Lagaras
 */
public class Amlodipine extends javax.swing.JFrame {

    /**
     * Creates new form SelectedItemForm
     */
    public Amlodipine() {
        initComponents();
    }

    /*
      This class represents the Amlodipine selection form in the Bulldogs
      Exchange Commerce system. It provides an interface for users to view
      cap details, select quantity, and manage their shopping cart.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblPrice = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        AddToCart = new javax.swing.JButton();
        EditCart = new javax.swing.JButton();
        CheckOut = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setBackground(new java.awt.Color(0, 153, 153));
        lblName.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("AMLODIPINE");
        lblName.setOpaque(true);
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 200, 30));

        jComboBox2.setBackground(new java.awt.Color(0, 153, 153));
        jComboBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QUANTITY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox2.setToolTipText("");
        jComboBox2.setMinimumSize(new java.awt.Dimension(81, 22));
        jComboBox2.setPreferredSize(new java.awt.Dimension(81, 22));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, 30));

        lblPrice.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        lblPrice.setText("PHP 50");
        getContentPane().add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 90, 30));

        Back.setBackground(new java.awt.Color(153, 153, 153));
        Back.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 60, 20));

        AddToCart.setBackground(new java.awt.Color(0, 153, 153));
        AddToCart.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        AddToCart.setText("ADD TO CART");
        AddToCart.setMaximumSize(new java.awt.Dimension(85, 25));
        AddToCart.setMinimumSize(new java.awt.Dimension(85, 25));
        AddToCart.setPreferredSize(new java.awt.Dimension(85, 25));
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(AddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 100, 20));

        EditCart.setBackground(new java.awt.Color(0, 153, 153));
        EditCart.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        EditCart.setText("EDIT CART");
        EditCart.setMaximumSize(new java.awt.Dimension(85, 25));
        EditCart.setMinimumSize(new java.awt.Dimension(85, 25));
        EditCart.setPreferredSize(new java.awt.Dimension(85, 25));
        EditCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCartActionPerformed(evt);
            }
        });
        getContentPane().add(EditCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 100, 20));

        CheckOut.setBackground(new java.awt.Color(0, 153, 153));
        CheckOut.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        CheckOut.setText("CHECK OUT");
        CheckOut.setMaximumSize(new java.awt.Dimension(85, 25));
        CheckOut.setMinimumSize(new java.awt.Dimension(85, 25));
        CheckOut.setPreferredSize(new java.awt.Dimension(85, 25));
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });
        getContentPane().add(CheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 100, 20));

        imageLabel.setBackground(new java.awt.Color(255, 255, 0));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageofhealth/amplof.png"))); // NOI18N
        imageLabel.setOpaque(true);
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONS LAYOUT (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 // The event triggered when clicking the "Back" button. 
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        HealthForm ac = new HealthForm();
        ac.show();
        dispose();

    }//GEN-LAST:event_BackActionPerformed

    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
        DefaultTableModel cartModel = getCartModel();

        if (cartModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Your cart is empty! Add items before checking out.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop further execution
        }

        // Proceed to successful purchase form
        GcashSuccessfulPurchaseForm sf = new GcashSuccessfulPurchaseForm(CartManager.getCartModel());
        AmlodipinePayment pf = new AmlodipinePayment();
        sf.setPurchaseDetails(cartModel);
        pf.setVisible(true);
        dispose();
    }//GEN-LAST:event_CheckOutActionPerformed

    private void EditCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCartActionPerformed
        // Create or retrieve the shared cart model
        DefaultTableModel cartModel = getCartModel();
        if (cartModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Your cart is empty! Add items before editing.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop further execution
        }
        // Open EditCartTable with the cart model
        amlodipine editCart = new amlodipine(cartModel);
        editCart.setVisible(true);
        dispose();
    }//GEN-LAST:event_EditCartActionPerformed

    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed

        String itemName = lblName.getText(); // Get item name
        int quantity = 0;
        double price;

        // Validate if the user selected a quantity
        if (jComboBox2.getSelectedIndex() == 0) { // Assuming the first item is "QUANTITY" or empty
            JOptionPane.showMessageDialog(this, "Please select a valid quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            quantity = Integer.parseInt(jComboBox2.getSelectedItem().toString()); // Get quantity
            price = Double.parseDouble(lblPrice.getText().replace("PHP ", "")); // Get price
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please select a valid quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double total = quantity * price; // Calculate total price

        DefaultTableModel cartModel = getCartModel(); // Ensure this method exists and retrieves a shared model
        if (cartModel != null) {
            cartModel.addRow(new Object[]{itemName, quantity, price, total});

            // Show confirmation message
            JOptionPane.showMessageDialog(this, itemName + " added to cart successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cart model is unavailable.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddToCartActionPerformed

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
            java.util.logging.Logger.getLogger(Amlodipine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amlodipine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amlodipine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amlodipine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Amlodipine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JButton Back;
    private javax.swing.JButton CheckOut;
    private javax.swing.JButton EditCart;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    // End of variables declaration//GEN-END:variables
}
