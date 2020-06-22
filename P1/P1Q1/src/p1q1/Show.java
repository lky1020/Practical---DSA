
package p1q1;

import java.util.*;
import java.text.*;
import javax.swing.*;
import javax.swing.table.* ;

public class Show extends javax.swing.JFrame {

    private List<Student> studentList = null;
    private DefaultTableModel studentModel;
    
    public Show() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Show(List<Student> student ){
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.studentList = student;
        
        studentModel = (DefaultTableModel)jTableStudentRecord.getModel();
        
        setModelRow();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelStudentRecord = new javax.swing.JLabel();
        jButtonDescending = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonAscending = new javax.swing.JButton();
        jButtonAverage1 = new javax.swing.JButton();
        jScrollPaneStudentRecord = new javax.swing.JScrollPane();
        jTableStudentRecord = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelStudentRecord.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelStudentRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStudentRecord.setText("Student Record");

        jButtonDescending.setText("Descending");
        jButtonDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescendingActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonAscending.setText("Ascending");
        jButtonAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAscendingActionPerformed(evt);
            }
        });

        jButtonAverage1.setText("Average");
        jButtonAverage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAverage1ActionPerformed(evt);
            }
        });

        jTableStudentRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Score"
            }
        ));
        jTableStudentRecord.setShowGrid(false);
        jScrollPaneStudentRecord.setViewportView(jTableStudentRecord);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelStudentRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDescending, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAverage1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPaneStudentRecord)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelStudentRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneStudentRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDescending, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAverage1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAscendingActionPerformed
        // TODO add your handling code here:
        studentModel = (DefaultTableModel)jTableStudentRecord.getModel();
        
        studentModel.setRowCount(0);
        
        studentList.sort(new TestScoreAscending());
        setModelRow();
        
    }//GEN-LAST:event_jButtonAscendingActionPerformed

    private void jButtonDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescendingActionPerformed
        // TODO add your handling code here:
        studentModel = (DefaultTableModel)jTableStudentRecord.getModel();
        
        studentModel.setRowCount(0);
        
        studentList.sort(new TestScoreDescending());
        setModelRow();
        
    }//GEN-LAST:event_jButtonDescendingActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        TestScore testScore = new TestScore(studentList);
        testScore.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonAverage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAverage1ActionPerformed
        // TODO add your handling code here:
        
        double scoreAverage = 0.0;
        
        for(int i = 0; i < studentList.size(); i++){
            
            scoreAverage += studentList.get(i).getTestScore();
        }
        
        scoreAverage /= studentList.size();
        
        JOptionPane.showMessageDialog(null, "Average: " + String.format("%.2f", scoreAverage), "Average", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonAverage1ActionPerformed

    private void setModelRow(){
        
        for(int i =0; i < studentList.size(); i++){
            
            studentModel.addRow(new Object[]{studentList.get(i).getStudentId(), studentList.get(i).getName(), studentList.get(i).getTestScore()});
            
        }
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAscending;
    private javax.swing.JButton jButtonAverage1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDescending;
    private javax.swing.JLabel jLabelStudentRecord;
    private javax.swing.JScrollPane jScrollPaneStudentRecord;
    private javax.swing.JTable jTableStudentRecord;
    // End of variables declaration//GEN-END:variables
}
