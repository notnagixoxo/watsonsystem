/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForms;

import SelectedProductShampoo.Gard;
import SelectedProductShampoo.Palmolive;
import SelectedProductShampoo.HeadandShoulders;
import SelectedProductShampoo.Dove;

/**
 *
 * @author Ryoji Lagaras
 */
public class Shampoo extends javax.swing.JFrame {

    /**
     * Creates new form Uniform
     */
    public Shampoo() {
        initComponents();
    }

    /*
      This form showcases a selection of uniforms tops available for purchase, including a Traditional Uniform, Psychology Uniform, NSTP Uniform, and  HM Uniform.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TraditionalUniform = new javax.swing.JButton();
        PsychologyUniform = new javax.swing.JButton();
        NSTPUniform = new javax.swing.JButton();
        HMUniform = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dove");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 120, 20));

        jlabel.setBackground(new java.awt.Color(0, 204, 204));
        jlabel.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel.setText("Head and Shoulders");
        jlabel.setOpaque(true);
        getContentPane().add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 120, 20));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gard");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 110, 20));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Palmolive");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 90, 20));

        TraditionalUniform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DOVE (1).png"))); // NOI18N
        TraditionalUniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraditionalUniformActionPerformed(evt);
            }
        });
        getContentPane().add(TraditionalUniform, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 177));

        PsychologyUniform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HNS (1).png"))); // NOI18N
        PsychologyUniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsychologyUniformActionPerformed(evt);
            }
        });
        getContentPane().add(PsychologyUniform, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 177));

        NSTPUniform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PALMOLIVE.png"))); // NOI18N
        NSTPUniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSTPUniformActionPerformed(evt);
            }
        });
        getContentPane().add(NSTPUniform, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 260, 177));

        HMUniform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/GARD (1).png"))); // NOI18N
        HMUniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HMUniformActionPerformed(evt);
            }
        });
        getContentPane().add(HMUniform, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 260, 177));

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

    private void TraditionalUniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraditionalUniformActionPerformed
        Dove bc = new Dove();
        bc.show(); // Open Bracelet Form
        dispose();
    }//GEN-LAST:event_TraditionalUniformActionPerformed

    private void PsychologyUniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsychologyUniformActionPerformed
        HeadandShoulders cp = new HeadandShoulders();
        cp.show(); // Open Cap Form
        dispose();
    }//GEN-LAST:event_PsychologyUniformActionPerformed

    private void NSTPUniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSTPUniformActionPerformed
        Palmolive mf = new Palmolive();
        mf.show(); // Open MiniFan Form
        dispose();
    }//GEN-LAST:event_NSTPUniformActionPerformed

    private void HMUniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HMUniformActionPerformed
        Gard db = new Gard();
        db.show(); // Open DuffleBag Form
        dispose();
    }//GEN-LAST:event_HMUniformActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        HairProducts mf = new  HairProducts();
        mf.show(); // Open MainForm
        dispose();  //Close Current Form
    }//GEN-LAST:event_Back1ActionPerformed

// The event triggered when clicking the "Tourism Uniform" button.// The event triggered when clicking the "NSTP Uniform" button.// The event triggered when clicking the "Culinary Button" button.// The event triggered when clicking the "Back" button.
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
            java.util.logging.Logger.getLogger(Shampoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shampoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shampoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shampoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Shampoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton HMUniform;
    private javax.swing.JButton NSTPUniform;
    private javax.swing.JButton PsychologyUniform;
    private javax.swing.JButton TraditionalUniform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}
