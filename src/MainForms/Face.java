/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForms;

import SelectedProductFace.Silka;
import SelectedProductFace.Myra;
import SelectedProductFace.Oxecure;
import SelectedProductFace.Vaseline;

/**
 *
 * @author Ryoji Lagaras
 */
public class Face extends javax.swing.JFrame {

    /**
     * Creates new form IDLaceForm
     */
    public Face() {
        initComponents();
    }

     /*
      This form showcases a selection of ID Laces available for purchase, including a Silka Lace, Myra Lace, Oxecure Lace, AND Vaseline Lace.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SECA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SASE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SBMA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SHS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SECA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OXECURE.png"))); // NOI18N
        SECA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SECAActionPerformed(evt);
            }
        });
        getContentPane().add(SECA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 177));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Oxecure");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 70, 20));

        SASE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SILKA.png"))); // NOI18N
        SASE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SASEActionPerformed(evt);
            }
        });
        getContentPane().add(SASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 177));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Silka");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 70, 20));

        SBMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MYRA.png"))); // NOI18N
        SBMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBMAActionPerformed(evt);
            }
        });
        getContentPane().add(SBMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 260, 177));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Myra");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 70, 20));

        SHS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/VASELINE.png"))); // NOI18N
        SHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHSActionPerformed(evt);
            }
        });
        getContentPane().add(SHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 260, 177));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vaseline");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 70, 20));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONSFRAME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// The event triggered when clicking the "Oxecure" button.
    private void SECAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SECAActionPerformed
        Oxecure sc= new Oxecure();
        sc.show();    //Open Oxecure form
        dispose();
    }//GEN-LAST:event_SECAActionPerformed
// The event triggered when clicking the "Silka" button.
    private void SASEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SASEActionPerformed
        Silka ss = new Silka();
        ss.show();  //Open Silka form
        dispose();
    }//GEN-LAST:event_SASEActionPerformed
// The event triggered when clicking the "Myra" button.
    private void SBMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBMAActionPerformed
        Myra sb= new Myra();
        sb.show();  //Open Myra form
        dispose();
    }//GEN-LAST:event_SBMAActionPerformed
// The event triggered when clicking the "Vaseline" button.
    private void SHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHSActionPerformed
        Vaseline sh = new Vaseline();
        sh.show();  //Open Vaseline form
        dispose();
    }//GEN-LAST:event_SHSActionPerformed
// The event triggered when clicking the "Back" button.
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainForm mf = new  MainForm();
        mf.show();
        dispose();
    }//GEN-LAST:event_BackActionPerformed

// The event triggered when clicking the "Silka" button.  // The event triggered when clicking the "Back" button.  
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
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Face().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton SASE;
    private javax.swing.JButton SBMA;
    private javax.swing.JButton SECA;
    private javax.swing.JButton SHS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
