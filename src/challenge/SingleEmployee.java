/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import Models.Entity.EmployeesModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Abnet
 */
public class SingleEmployee extends javax.swing.JPanel {

    EmployeesModel data;
    
    /**
     * Creates new form EmployeePanel
     * @param model
     */
    public SingleEmployee(EmployeesModel model) {
        data = model;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();


        setLayout(null);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 119, 0)));

        jLabel1.setText("image");
        add(jLabel1);
        jLabel1.setBounds(10, 11, 80, 70);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new EmployeeUpdate(data).setVisible(true);
                Challenge.lister.setVisible(false);
            }
        });
        add(jButton1);
        
        jButton1.setBounds(630, 20, 40, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText(data.gender);
        add(jLabel2);
        jLabel2.setBounds(500, 20, 110, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText(data.first_name);
        add(jLabel3);
        jLabel3.setBounds(104, 20, 110, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText(data.last_name);
        add(jLabel4);
        jLabel4.setBounds(240, 20, 110, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText(data.email);
        add(jLabel5);
        jLabel5.setBounds(370, 20, 110, 40);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                if(JOptionPane.showConfirmDialog(Challenge.lister, "Are you sure?!") == 0){
                    Challenge.employee_repo.delete(data.id);
                    Challenge.lister.initializeList();
                }
                
            }
        });
        add(jButton2);
        jButton2.setBounds(680, 20, 40, 40);

    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
//    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}
