/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;


public class RegionalManager extends javax.swing.JFrame {

    /**
     * Creates new form RegionalManager
     */
    public RegionalManager() {
        initComponents();
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelExit = new javax.swing.JLabel();
        jLabelViewFeedButton = new javax.swing.JLabel();
        jLabelViewPerfButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Feed = new javax.swing.JLabel();
        Rate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 662));
        setPreferredSize(new java.awt.Dimension(980, 662));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 60, 60));

        jLabelViewFeedButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelViewFeedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelViewFeedButtonMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelViewFeedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 50));

        jLabelViewPerfButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelViewPerfButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelViewPerfButtonMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelViewPerfButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 730, 380));

        Feed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Feed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedMouseClicked(evt);
            }
        });
        getContentPane().add(Feed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 230, 50));

        Rate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRCompanion/images/Regional_1.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(980, 662));
        jLabel1.setMinimumSize(new java.awt.Dimension(980, 662));
        jLabel1.setPreferredSize(new java.awt.Dimension(980, 662));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 662));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        // TODO add your handling code here:
        LoginForm l = new LoginForm();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelViewFeedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelViewFeedButtonMouseClicked
        // TODO add your handling code here:
        jScrollPane1.setEnabled(true);
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_jLabelViewFeedButtonMouseClicked

    private void jLabelViewPerfButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelViewPerfButtonMouseClicked
        // TODO add your handling code here:
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
        
    }//GEN-LAST:event_jLabelViewPerfButtonMouseClicked

    private void FeedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedMouseClicked
        // TODO add your handling code here:
        
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_FeedMouseClicked

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
            java.util.logging.Logger.getLogger(RegionalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegionalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegionalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegionalManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegionalManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Feed;
    private javax.swing.JLabel Rate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelViewFeedButton;
    private javax.swing.JLabel jLabelViewPerfButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
