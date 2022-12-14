/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import Models.Entity.EmployeesModel;
import Validations.EmployeeValidator;
import javax.swing.JOptionPane;

/**
 *
 * @author Abnet
 */
public class EmployeeUpdate extends javax.swing.JFrame {

    EmployeesModel employee;
    /**
     * Creates new form EmployeeUpdate
     * @param emply
     */
    public EmployeeUpdate(EmployeesModel emply) {
        
        initComponents();
        
        this.employee = emply;
        
        this.FirstNameField.setText(employee.first_name);
        this.LastNameField.setText(employee.last_name);
        this.EmailField.setText(employee.email);
        this.GenderSelector.setSelectedItem(employee.gender);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        GenderSelector = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 17, 21));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(2, 17, 21));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(252, 119, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 390, 270, 40);

        GenderSelector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GenderSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderSelector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 119, 0)));
        GenderSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderSelectorItemStateChanged(evt);
            }
        });
        jPanel1.add(GenderSelector);
        GenderSelector.setBounds(60, 330, 270, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 300, 90, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 220, 90, 20);

        EmailField.setBackground(new java.awt.Color(226, 226, 226));
        EmailField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        EmailField.setForeground(new java.awt.Color(51, 51, 51));
        EmailField.setToolTipText("Enter First Name");
        EmailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        EmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailFieldKeyReleased(evt);
            }
        });
        jPanel1.add(EmailField);
        EmailField.setBounds(60, 250, 270, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Last Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 140, 90, 20);

        LastNameField.setBackground(new java.awt.Color(226, 226, 226));
        LastNameField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LastNameField.setForeground(new java.awt.Color(51, 51, 51));
        LastNameField.setToolTipText("Enter First Name");
        LastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        LastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LastNameFieldKeyReleased(evt);
            }
        });
        jPanel1.add(LastNameField);
        LastNameField.setBounds(60, 170, 270, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 60, 90, 20);

        FirstNameField.setBackground(new java.awt.Color(226, 226, 226));
        FirstNameField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        FirstNameField.setForeground(new java.awt.Color(51, 51, 51));
        FirstNameField.setToolTipText("Enter First Name");
        FirstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        FirstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FirstNameFieldKeyReleased(evt);
            }
        });
        jPanel1.add(FirstNameField);
        FirstNameField.setBounds(60, 90, 270, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Employee");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 10, 180, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 470);

        setSize(new java.awt.Dimension(413, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

            new EmployeeValidator().Validate(employee);

            Challenge.employee_repo.update(employee);
            Challenge.openListPage();
            this.setVisible(false);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Employee Updated Successfully");

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenderSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderSelectorItemStateChanged
        employee.gender = GenderSelector.getSelectedItem().toString();
    }//GEN-LAST:event_GenderSelectorItemStateChanged

    private void FirstNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameFieldKeyReleased
        employee.first_name = FirstNameField.getText();
    }//GEN-LAST:event_FirstNameFieldKeyReleased

    private void LastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameFieldKeyReleased
        employee.last_name = LastNameField.getText();
    }//GEN-LAST:event_LastNameFieldKeyReleased

    private void EmailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailFieldKeyReleased
        employee.email = EmailField.getText();
    }//GEN-LAST:event_EmailFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EmployeeUpdate().setVisible(true);
//            }
//        });
        
//        new EmployeeUpdate().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JComboBox<String> GenderSelector;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
