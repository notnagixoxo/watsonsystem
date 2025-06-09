/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForms;

import SelectedProductHealth.Neozep;
import SelectedProductHealth.Amlodipine;
import SelectedProductHealth.Paracetamol;
import SelectedProductHealth.Centrum;

/**
 *
 * @author Ryoji Lagaras
 */
public class HealthForm extends javax.swing.JFrame {

    /**
     * Creates new form AccessoriesForm
     */
    public HealthForm() {
        initComponents();
    }

    /*
      This form showcases a selection of accessories available for purchase, including a Paracetamol, Mini Fan, Amlodipine, and Duffle Bag. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bracelet = new javax.swing.JButton();
        MiniFan = new javax.swing.JButton();
        DuffleBag = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Cap1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paracetamol");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 90, 20));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Centrum Advance");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 110, 20));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Neozep");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 70, 20));

        Bracelet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PAYB.png"))); // NOI18N
        Bracelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BraceletActionPerformed(evt);
            }
        });
        getContentPane().add(Bracelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 177));

        MiniFan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/NEOZEP (1).png"))); // NOI18N
        MiniFan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiniFanActionPerformed(evt);
            }
        });
        getContentPane().add(MiniFan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 260, 177));

        DuffleBag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CENTRUM.png"))); // NOI18N
        DuffleBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuffleBagActionPerformed(evt);
            }
        });
        getContentPane().add(DuffleBag, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 177));

        Back.setBackground(new java.awt.Color(0, 204, 204));
        Back.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        Cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/AMPLODIPINE.png"))); // NOI18N
        Cap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cap1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 260, 177));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Amlodipine");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONSFRAME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Duffle Bag");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 70, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// The event triggered when clicking the "Paracetamol" button.
    private void BraceletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BraceletActionPerformed
        Paracetamol bc = new Paracetamol();
        bc.show(); // Open Paracetamol Form
        dispose();
    }//GEN-LAST:event_BraceletActionPerformed
// The event triggered when clicking the "Mini Fan" button.
    private void MiniFanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiniFanActionPerformed
        Neozep mf = new Neozep();
        mf.show(); // Open Neozep Form
        dispose();
    }//GEN-LAST:event_MiniFanActionPerformed

    private void DuffleBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuffleBagActionPerformed
       Centrum mf = new Centrum();
        mf.show(); // Open Neozep Form
        dispose();
    }//GEN-LAST:event_DuffleBagActionPerformed
// The event triggered when clicking the "Back" button.
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainForm mf = new MainForm();
        mf.show(); // Open MainForm
        dispose();  //Close Current Form
    }//GEN-LAST:event_BackActionPerformed

// The event triggered when clicking the "Amlodipine" button.
    private void Cap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cap1ActionPerformed
        Amlodipine cp = new Amlodipine();
        cp.show();
        dispose();
    }//GEN-LAST:event_Cap1ActionPerformed

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
            java.util.logging.Logger.getLogger(HealthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Bracelet;
    private javax.swing.JButton Cap1;
    private javax.swing.JButton DuffleBag;
    private javax.swing.JButton MiniFan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
