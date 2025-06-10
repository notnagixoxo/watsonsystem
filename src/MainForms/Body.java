/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForms;

import SelectedProductBody.Dove;
import SelectedProductBody.SafeGuard;
import SelectedProductBody.SeoulWhite;
import SelectedProductBody.Cetaphil;

/**
 *
 * @author Ryoji Lagaras
 */
public class Body extends javax.swing.JFrame {

    /**
     * Creates new form MerchandiseForm
     */
    public Body() {
        initComponents();
    }

     /*
      This form showcases a selection of merchandise available for purchase, including a SeoulWhite, Stuff Toy, T-shirt, and  Cetaphil.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tumbler = new javax.swing.JButton();
        Tshirt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Jacket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        StuffToy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tumbler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CETAPHIL.png"))); // NOI18N
        Tumbler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TumblerActionPerformed(evt);
            }
        });
        getContentPane().add(Tumbler, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 260, 177));

        Tshirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DOVESOAP.png"))); // NOI18N
        Tshirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TshirtActionPerformed(evt);
            }
        });
        getContentPane().add(Tshirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 260, 177));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dove");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 70, 20));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cetaphil");
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

        Jacket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SEOULWHITE.png"))); // NOI18N
        Jacket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JacketActionPerformed(evt);
            }
        });
        getContentPane().add(Jacket, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 177));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seoul White");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 70, 20));

        StuffToy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TWU.png"))); // NOI18N
        StuffToy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuffToyActionPerformed(evt);
            }
        });
        getContentPane().add(StuffToy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 177));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Safe Guard");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONSFRAME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// The event triggered when clicking the "Cetaphil" button.
    private void TumblerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TumblerActionPerformed
        Cetaphil tb = new Cetaphil();
        tb.show();
        dispose();
    }//GEN-LAST:event_TumblerActionPerformed
// The event triggered when clicking the "Dove" button.
    private void TshirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TshirtActionPerformed
        Dove ts = new Dove();
        ts.show();
        dispose();
    }//GEN-LAST:event_TshirtActionPerformed
// The event triggered when clicking the "Back" button.
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainForm mf = new  MainForm();
        mf.show();
        dispose();
    }//GEN-LAST:event_BackActionPerformed
// The event triggered when clicking the "SeoulWhite" button.
    private void JacketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JacketActionPerformed
        SeoulWhite jc = new SeoulWhite();
        jc.show();
        dispose();
    }//GEN-LAST:event_JacketActionPerformed
    // The event triggered when clicking the "Stuff Toy" button.
    private void StuffToyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuffToyActionPerformed
        SafeGuard st = new SafeGuard();
        st.show();
        dispose();
    }//GEN-LAST:event_StuffToyActionPerformed

// The event triggered when clicking the "Back" button.
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
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Body().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Jacket;
    private javax.swing.JButton StuffToy;
    private javax.swing.JButton Tshirt;
    private javax.swing.JButton Tumbler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
