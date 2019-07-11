
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gamith
 */
public class ManagePatientsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagePatientsForm
     */
    patient pat = new patient();
    DefaultTableModel model;

    public ManagePatientsForm() {
        initComponents();
        pat.fillStudentJtable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLUE);
        jTable1.setSelectionBackground(Color.orange);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Val_Search = new javax.swing.JTextField();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jDateChooser_DOB = new com.toedter.calendar.JDateChooser();
        jTextField_PContact = new javax.swing.JTextField();
        jTextField_GName = new javax.swing.JTextField();
        jTextField_GContact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jTextField_Email = new javax.swing.JTextField();
        jButton_UpdatePatient = new javax.swing.JButton();
        jButton_DeletePatient = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField_NIC1 = new javax.swing.JTextField();
        jButton_AddPatient1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_PID1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Manage Patients");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("NIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 163, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 125, 18));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Patient Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("FirstName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 206, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("LastName");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 253, -1, 13));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 310, -1, 13));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setText("DOB");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 367, -1, 13));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Contact No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 412, -1, 13));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Enter Value To Search ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 120, -1, 13));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel20.setText("Address");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 459, -1, 13));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setText("Gurdian Details");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 638, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 668, 134, 10));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Gurdian Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 693, -1, 13));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setText("Gurdian Contact No");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 739, -1, 13));

        jTextField_Val_Search.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_Val_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Val_SearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Val_SearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Val_SearchKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Val_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 110, 260, -1));

        jTextField_FName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField_FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 205, 267, -1));

        jTextField_LName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField_LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 248, 267, -1));

        jRadioButtonMale.setText("Male");
        jPanel1.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 298, -1, -1));

        jRadioButtonFemale.setText("Female");
        jPanel1.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 298, -1, -1));

        jDateChooser_DOB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jDateChooser_DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 358, 267, -1));

        jTextField_PContact.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_PContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PContactKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_PContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 407, 267, -1));

        jTextField_GName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField_GName, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 688, 267, -1));

        jTextField_GContact.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_GContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_GContactKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_GContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 734, 267, -1));

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 459, 267, -1));

        jTextField_Email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 584, 267, -1));

        jButton_UpdatePatient.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_UpdatePatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_renew_4168571.png"))); // NOI18N
        jButton_UpdatePatient.setText("Update");
        jButton_UpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdatePatientActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_UpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 780, 130, 50));

        jButton_DeletePatient.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_DeletePatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_close_309090.png"))); // NOI18N
        jButton_DeletePatient.setText("Delete");
        jButton_DeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeletePatientActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_DeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 780, 130, 50));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setText("Email");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 589, -1, 13));

        jTextField_NIC1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField_NIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 162, 267, -1));

        jButton_AddPatient1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton_AddPatient1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_user_half_add_103774 (1).png"))); // NOI18N
        jButton_AddPatient1.setText("Add");
        jButton_AddPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddPatient1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AddPatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 780, 140, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NIC", "FirstName", "LastName", "Gender", "DOB", "Contact No", "Address", "Email", "Gurdian Name", "Gurdian PNo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 1030, 670));

        jTextField_PID1.setEditable(false);
        jTextField_PID1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField_PID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 150, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setText("PID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 13));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1650, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PContactKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar())) {

            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PContactKeyTyped

    private void jTextField_GContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_GContactKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {

            evt.consume();
        }
    }//GEN-LAST:event_jTextField_GContactKeyTyped

    public boolean verifyText() {
        if (jTextField_NIC1.getText().equals("") || jTextField_FName.getText().equals("") || jTextField_PID1.getText().equals("") || jDateChooser_DOB.getDate() == null || jTextField_PContact.getText().equals("") || jTextAreaAddress.getText().equals("") || jTextField_Email.getText().equals("") || jTextField_GName.getText().equals("") || jTextField_GContact.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "One Or More Empty Fields");
            return false;

        } else if (jDateChooser_DOB.getDate().compareTo(new Date()) > 0) {

            JOptionPane.showMessageDialog(null, "Invalid DOB");
            return false;

        } else {

            return true;

        }

    }


    private void jButton_UpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdatePatientActionPerformed
        // TODO add your handling code here:

        String NIC = jTextField_NIC1.getText();
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        int id = Integer.valueOf(jTextField_PID1.getText());
        String sex = "";
        if (jRadioButtonFemale.isSelected()) {
            sex = "Female";
//        } else if (jRadioButtonFemale.isSelected()) {
//
//            sex = "Male";
//       }
        }
        String phone = jTextField_PContact.getText();

        String address = jTextAreaAddress.getText();

        String email = jTextField_Email.getText();

        String gname = jTextField_GName.getText();

        String gphone = jTextField_GContact.getText();

        if (verifyText()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(jDateChooser_DOB.getDate());
            patient pat = new patient();

            pat.insertUpdateDeletePatient('u', id, NIC, fname, lname, sex, bdate, phone, address, email, gname, gphone);
            //MainForm.jLabel_Pcount.setText("Patient Count = "+Integer.toString(MyFunction.countData("patient")));
            
                     ManagePatientsForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"PID","NIC","FirstName","LastName","Gender","DOB","Contact No","Address","Email","Gurdian Name","Gurdian PNo"}));
        pat.fillStudentJtable(ManagePatientsForm.jTable1, "");
        }

    }//GEN-LAST:event_jButton_UpdatePatientActionPerformed

    private void jButton_DeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletePatientActionPerformed

        if (jTextField_PID1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No Patient Selected");

        } else {

            int id = Integer.valueOf(jTextField_PID1.getText());
            pat.insertUpdateDeletePatient('d', id, null, null, null, null, null, null, null, null, null, null);
            pat.fillStudentJtable(jTable1, "");
            pat.fillStudentJtable(jTable1, jTextField_Val_Search.getText());
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"PID", "NIC", "FirstName", "LastName", "Gender", "DOB", "Contact No", "Address", "Email", "Gurdian Name", "Gurdian PNo"}));
            pat.fillStudentJtable(jTable1, jTextField_Val_Search.getText());
            MainForm.jLabel_Pcount.setText(" Patient Count = " + Integer.toString(MyFunction.countData("patient")));

            jTextField_PID1.setText("");
            jTextField_NIC1.setText("");
            jTextField_FName.setText("");
            jTextField_LName.setText("");
            jTextField_PContact.setText("");
            jTextAreaAddress.setText("");
            jTextField_Email.setText("");
            jTextField_GName.setText("");
            jTextField_GContact.setText("");
            jRadioButtonFemale.setSelected(false);
            jRadioButtonMale.setSelected(false);
            jDateChooser_DOB.setDate(null);

        }
    }//GEN-LAST:event_jButton_DeletePatientActionPerformed

    private void jButton_AddPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddPatient1ActionPerformed
        // TODO add your handling code here:

        AddPatient ap = new AddPatient();
        ap.setVisible(true);
        ap.pack();
        ap.setLocationRelativeTo(null);
        ap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_jButton_AddPatient1ActionPerformed

    int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        rowIndex = jTable1.getSelectedRow();

        if (model.getValueAt(rowIndex, 4).toString().equals("Male")) {
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);

        } else {

            jRadioButtonFemale.setSelected(true);
            jRadioButtonMale.setSelected(false);

        }

        jTextField_PID1.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_NIC1.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_FName.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_LName.setText(model.getValueAt(rowIndex, 3).toString());
        jTextField_PContact.setText(model.getValueAt(rowIndex, 6).toString());
        jTextAreaAddress.setText(model.getValueAt(rowIndex, 7).toString());
        jTextField_Email.setText(model.getValueAt(rowIndex, 8).toString());
        jTextField_GName.setText(model.getValueAt(rowIndex, 9).toString());
        jTextField_GContact.setText(model.getValueAt(rowIndex, 10).toString());

        Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 5).toString());
            jDateChooser_DOB.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(ManagePatientsForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_Val_SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_SearchKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField_Val_SearchKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTable1KeyPressed

    private void jTextField_Val_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_SearchKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField_Val_SearchKeyPressed

    private void jTextField_Val_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_SearchKeyReleased
        // TODO add your handling code here:

        jTable1.setModel(new DefaultTableModel(null, new Object[]{"PID", "NIC", "FirstName", "LastName", "Gender", "DOB", "Contact No", "Address", "Email", "Gurdian Name", "Gurdian PNo"}));
        pat.fillStudentJtable(jTable1, jTextField_Val_Search.getText());
    }//GEN-LAST:event_jTextField_Val_SearchKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {

            rowIndex = jTable1.getSelectedRow();
            jTextField_PID1.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField_NIC1.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField_FName.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField_LName.setText(model.getValueAt(rowIndex, 3).toString());
            jTextField_PContact.setText(model.getValueAt(rowIndex, 6).toString());
            jTextAreaAddress.setText(model.getValueAt(rowIndex, 7).toString());
            jTextField_Email.setText(model.getValueAt(rowIndex, 8).toString());
            jTextField_GName.setText(model.getValueAt(rowIndex, 9).toString());
            jTextField_GContact.setText(model.getValueAt(rowIndex, 10).toString());

            if (model.getValueAt(rowIndex, 4).toString().equals("Male")) {
                jRadioButtonMale.setSelected(true);
                jRadioButtonFemale.setSelected(false);

            } else {

                jRadioButtonFemale.setSelected(true);
                jRadioButtonMale.setSelected(false);

            }

            Date bdate;
            try {
                bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 5).toString());
                jDateChooser_DOB.setDate(bdate);
            } catch (ParseException ex) {
                Logger.getLogger(ManagePatientsForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(ManagePatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagePatientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddPatient1;
    private javax.swing.JButton jButton_DeletePatient;
    private javax.swing.JButton jButton_UpdatePatient;
    private com.toedter.calendar.JDateChooser jDateChooser_DOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_GContact;
    private javax.swing.JTextField jTextField_GName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_NIC1;
    private javax.swing.JTextField jTextField_PContact;
    private javax.swing.JTextField jTextField_PID1;
    private javax.swing.JTextField jTextField_Val_Search;
    // End of variables declaration//GEN-END:variables
}
