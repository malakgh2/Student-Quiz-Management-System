/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.poopr;

/**
 *
 * @author Malek
 */
public class correcjav extends javax.swing.JFrame {

    /**
     * Creates new form correcjav
     */
    public correcjav() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A3_Q3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        A1_Q1 = new javax.swing.JRadioButton();
        A2_Q1 = new javax.swing.JRadioButton();
        A3_Q1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        A1_Q2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        A2_Q2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        A3_Q2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        A1_Q3 = new javax.swing.JRadioButton();
        A2_Q3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(550, 620));

        A3_Q3.setSelected(true);
        A3_Q3.setText("None of the above");
        A3_Q3.setEnabled(false);

        jLabel6.setText("QUESTION 2");

        jLabel7.setText("Which Map class should be most popular in a multi-threading environment, considering performance constraint?");

        A1_Q1.setText(" HashSet ");
        A1_Q1.setEnabled(false);
        A1_Q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1_Q1ActionPerformed(evt);
            }
        });

        A2_Q1.setSelected(true);
        A2_Q1.setText(" ConcurrentSkipListSet ");
        A2_Q1.setEnabled(false);
        A2_Q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2_Q1ActionPerformed(evt);
            }
        });

        A3_Q1.setText("LinkedHashSet");
        A3_Q1.setEnabled(false);

        jLabel5.setText("Which Set class should be most popular in a multi-threading environment, considering performance constraint ?  ");

        A1_Q2.setText("Hashtable");
        A1_Q2.setEnabled(false);
        A1_Q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1_Q2ActionPerformed(evt);
            }
        });

        jLabel4.setText("QUESTION 1 ");

        A2_Q2.setSelected(true);
        A2_Q2.setText("CopyOnWriteMap");
        A2_Q2.setEnabled(false);
        A2_Q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2_Q2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("-QUIZZ POO-");

        A3_Q2.setText("ConcurrentHashMap");
        A3_Q2.setEnabled(false);
        A3_Q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3_Q2ActionPerformed(evt);
            }
        });

        jLabel8.setText("QUESTION 3 ");

        jLabel9.setText("Which allows the removal of elements from a collection?");

        A1_Q3.setText("Enumeration");
        A1_Q3.setEnabled(false);

        A2_Q3.setText("Iterator");
        A2_Q3.setEnabled(false);
        A2_Q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2_Q3ActionPerformed(evt);
            }
        });

        jLabel3.setText("professeur:Dina ABDELI ");

        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A2_Q1)
                                    .addComponent(A3_Q1)
                                    .addComponent(A1_Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(A1_Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(A2_Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(A3_Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(A1_Q3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(A2_Q3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(A3_Q3))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A1_Q1)
                .addGap(2, 2, 2)
                .addComponent(A2_Q1)
                .addGap(7, 7, 7)
                .addComponent(A3_Q1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A1_Q2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A2_Q2)
                .addGap(7, 7, 7)
                .addComponent(A3_Q2)
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(A1_Q3)
                .addGap(7, 7, 7)
                .addComponent(A2_Q3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A3_Q3)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1_Q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1_Q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1_Q1ActionPerformed

    private void A2_Q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2_Q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2_Q1ActionPerformed

    private void A1_Q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1_Q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1_Q2ActionPerformed

    private void A2_Q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2_Q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2_Q2ActionPerformed

    private void A3_Q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3_Q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3_Q2ActionPerformed

    private void A2_Q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2_Q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2_Q3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(correcjav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(correcjav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(correcjav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(correcjav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new correcjav().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1_Q1;
    private javax.swing.JRadioButton A1_Q2;
    private javax.swing.JRadioButton A1_Q3;
    private javax.swing.JRadioButton A2_Q1;
    private javax.swing.JRadioButton A2_Q2;
    private javax.swing.JRadioButton A2_Q3;
    private javax.swing.JRadioButton A3_Q1;
    private javax.swing.JRadioButton A3_Q2;
    private javax.swing.JRadioButton A3_Q3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
