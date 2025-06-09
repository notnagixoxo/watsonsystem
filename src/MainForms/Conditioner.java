/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForms;

import SelectedProductConditionr.Keratin;
import SelectedProductConditionr.NannyRose;
import SelectedProductConditionr.Pantene;
import SelectedProductConditionr.Tresemme;

/**
 *
 * @author Ryoji Lagaras
 */
public class Conditioner extends javax.swing.JFrame {

    /**
     * Creates new form Uniform
     */
    public Conditioner() {
        initComponents();
    }

    /*
      This form showcases a selection of uniforms bottoms available for purchase, including a Traditional Pants, Psychology Pants, Psychology Skirt, and  HM Skirt.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TraditionalPants = new javax.swing.JButton();
        PsychologyPants = new javax.swing.JButton();
        HMSkirt = new javax.swing.JButton();
        PsychologySkirt = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tresemme");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 110, 20));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nanny Rose");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 110, 20));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pantene");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 110, 20));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Keratin");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 70, 20));

        TraditionalPants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/KERATIN2.png"))); // NOI18N
        TraditionalPants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraditionalPantsActionPerformed(evt);
            }
        });
        getContentPane().add(TraditionalPants, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 177));

        PsychologyPants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/NANNYROSE.png"))); // NOI18N
        PsychologyPants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsychologyPantsActionPerformed(evt);
            }
        });
        getContentPane().add(PsychologyPants, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 177));

        HMSkirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/KERATIN.png"))); // NOI18N
        HMSkirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HMSkirtActionPerformed(evt);
            }
        });
        getContentPane().add(HMSkirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 260, 177));

        PsychologySkirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PANTENE.png"))); // NOI18N
        PsychologySkirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsychologySkirtActionPerformed(evt);
            }
        });
        getContentPane().add(PsychologySkirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 260, 177));

        Back1.setBackground(new java.awt.Color(0, 204, 204));
        Back1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        Back1.setForeground(new java.awt.Color(255, 255, 255));
        Back1.setText("BACK");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        getContentPane().add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONSFRAME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// The event triggered when clicking the "Traditional Pants" button.
    private void TraditionalPantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraditionalPantsActionPerformed
        Tresemme bc = new Tresemme();
        bc.show(); // Open Tresemme
        dispose();
    }//GEN-LAST:event_TraditionalPantsActionPerformed
// The event triggered when clicking the "Psychology Pants" button.
    private void PsychologyPantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsychologyPantsActionPerformed
        NannyRose cp = new NannyRose();
        cp.show(); // Open  NannyRose
        dispose();
    }//GEN-LAST:event_PsychologyPantsActionPerformed
// The event triggered when clicking the "HM Skirt" button.
    private void HMSkirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HMSkirtActionPerformed
        Keratin mf = new Keratin();
        mf.show(); // Open Keratin
        dispose();
    }//GEN-LAST:event_HMSkirtActionPerformed
// The event triggered when clicking the "Psychology Skirt" button.
    private void PsychologySkirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsychologySkirtActionPerformed
        Pantene db = new Pantene();
        db.show(); // Open DuffleBag Form
        dispose();
    }//GEN-LAST:event_PsychologySkirtActionPerformed
// The event triggered when clicking the Back" button.
    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        HairProducts mf = new  HairProducts();
        mf.show(); // Open MainForm
        dispose();  //Close Current Form
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
            java.util.logging.Logger.getLogger(Conditioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conditioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conditioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conditioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Conditioner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton HMSkirt;
    private javax.swing.JButton PsychologyPants;
    private javax.swing.JButton PsychologySkirt;
    private javax.swing.JButton TraditionalPants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
