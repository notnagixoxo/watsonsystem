/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainForms;

/**
 *
 * 
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /*
      This form showcases a selection of items available for purchase, including a Uniform, ID Lace, Merchandise, and Accessories.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Uniform = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Merchandise = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        IDLace = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Accessories = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Uniform.setBackground(new java.awt.Color(100, 100, 100));
        Uniform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HAIR.png"))); // NOI18N
        Uniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UniformActionPerformed(evt);
            }
        });
        getContentPane().add(Uniform, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, 177));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hair");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 70, 20));

        Merchandise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BODY.png"))); // NOI18N
        Merchandise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerchandiseActionPerformed(evt);
            }
        });
        getContentPane().add(Merchandise, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 177));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Body");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 80, 20));

        IDLace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/FACE.png"))); // NOI18N
        IDLace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDLaceActionPerformed(evt);
            }
        });
        getContentPane().add(IDLace, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 260, 177));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Face");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 70, 20));

        Accessories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HEALTH.png"))); // NOI18N
        Accessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessoriesActionPerformed(evt);
            }
        });
        getContentPane().add(Accessories, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 260, 177));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Health");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 80, 20));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WATSONSFRAME.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 900, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UniformActionPerformed
        HairProducts uf = new HairProducts();
        uf.show();
        dispose();
    }//GEN-LAST:event_UniformActionPerformed

    private void MerchandiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerchandiseActionPerformed
        Body mf = new Body();
        mf.show();
        dispose();
    }//GEN-LAST:event_MerchandiseActionPerformed

    private void IDLaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDLaceActionPerformed
        Face id = new Face();
        id.show();
        dispose();
    }//GEN-LAST:event_IDLaceActionPerformed

    private void AccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessoriesActionPerformed
        HealthForm af = new HealthForm();
        af.show();
        dispose();
    }//GEN-LAST:event_AccessoriesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0); //close the program
    }//GEN-LAST:event_jButton1ActionPerformed

// The event triggered when clicking the "Merchandise" button.  // The event triggered when clicking the "ID Lace" button.// The event triggered when clicking the "Accessories" button.
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accessories;
    private javax.swing.JButton IDLace;
    private javax.swing.JButton Merchandise;
    private javax.swing.JButton Uniform;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
