/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import Models.Entity.EmployeesModel;
import Validations.EmployeeValidator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Abnet
 */
public class RegistrationComponent extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationComponent
     */
    public RegistrationComponent() {
        initComponents();
        setSize(new java.awt.Dimension(886, 569));
//        setSize(new java.awt.Dimension(881, 543));
        sideImage.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Assets/display_image.png")).getImage()));
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
        jLabel2 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        GenderSelector = new javax.swing.JComboBox<>();
        sideImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(881, 543));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(2, 17, 21));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register Employee");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 20, 230, 32);

        LastNameField.setBackground(new java.awt.Color(226, 226, 226));
        LastNameField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LastNameField.setForeground(new java.awt.Color(51, 51, 51));
        LastNameField.setToolTipText("Enter Last Name");
        LastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(LastNameField);
        LastNameField.setBounds(110, 180, 270, 40);

        PasswordField.setBackground(new java.awt.Color(226, 226, 226));
        PasswordField.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(51, 51, 51));
        PasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        jPanel1.add(PasswordField);
        PasswordField.setBounds(110, 420, 270, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 390, 90, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 150, 90, 20);

        jButton1.setBackground(new java.awt.Color(252, 119, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 480, 270, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 310, 90, 20);

        EmailField.setBackground(new java.awt.Color(226, 226, 226));
        EmailField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        EmailField.setForeground(new java.awt.Color(51, 51, 51));
        EmailField.setToolTipText("Email Address");
        EmailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(EmailField);
        EmailField.setBounds(110, 260, 270, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 70, 90, 20);

        FirstNameField.setBackground(new java.awt.Color(226, 226, 226));
        FirstNameField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        FirstNameField.setForeground(new java.awt.Color(51, 51, 51));
        FirstNameField.setToolTipText("Enter First Name");
        FirstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(252, 119, 0), 1, true));
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(FirstNameField);
        FirstNameField.setBounds(110, 100, 270, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Email");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 230, 90, 20);

        GenderSelector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GenderSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderSelector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 119, 0)));
        jPanel1.add(GenderSelector);
        GenderSelector.setBounds(110, 340, 270, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(400, 0, 480, 540);

        sideImage.setText("jLabel1");
        getContentPane().add(sideImage);
        sideImage.setBounds(0, 0, 400, 540);

        setSize(new java.awt.Dimension(895, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            
            EmployeesModel employee = new EmployeesModel(
                FirstNameField.getText(), 
                LastNameField.getText(), 
                GenderSelector.getSelectedItem().toString(), 
                EmailField.getText(), 
                PasswordField.getText()
            );
            
            new EmployeeValidator().Validate(employee);
            
            Challenge.employee_repo.create(employee);
            Challenge.openLoginPage();
            JOptionPane.showMessageDialog(null, "Employee Registered Successfully");
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
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
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegistrationComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistrationComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistrationComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistrationComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrationComponent().setVisible(true);
//            }
//        });
        
//        new RegistrationComponent().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JComboBox<String> GenderSelector;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sideImage;
    // End of variables declaration//GEN-END:variables
}
