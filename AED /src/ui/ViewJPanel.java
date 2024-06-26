/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.EmployeeDetails;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import model.EmployeeHistory;



/**
 *
 * @author jadhavmrinalini
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistory details;
    EmployeeDetails emp;
    ArrayList<EmployeeDetails> tableContents;
    public ViewJPanel(EmployeeHistory details) {
        initComponents();
        
      this.details = details;
    this.tableContents = new ArrayList<>();
    populateTable();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblCellphone = new javax.swing.JLabel();
        lblEmailAdd = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSdate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        lblTitle1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtCellphone = new javax.swing.JTextField();
        lblEmpID = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblSdate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnsearchName = new javax.swing.JButton();
        displayImg = new javax.swing.JLabel();
        txtSearchByName = new javax.swing.JTextField();
        txtSearchByEmpId = new javax.swing.JTextField();
        btnSearchByEmpID = new javax.swing.JButton();
        txtSearchByPositionTitle = new javax.swing.JTextField();
        btnSearchByPosTitle = new javax.swing.JButton();
        txtSearchByGender = new javax.swing.JTextField();
        btnSearchByGender = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee Records");

        lblContactInfo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblContactInfo.setForeground(new java.awt.Color(153, 0, 51));
        lblContactInfo.setText("Contact Info:");

        lblPosTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPosTitle.setText("Posn. Title:");

        lblTeamInfo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTeamInfo.setText("Team Info:");

        lblCellphone.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCellphone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCellphone.setText("Cellphone:");

        lblEmailAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEmailAdd.setText("Email Address:");

        lblPhoto.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPhoto.setText("Photo:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name:");

        txtCellphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellphoneActionPerformed(evt);
            }
        });

        lblEmpID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEmpID.setText("Employee ID:");

        txtEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblAge.setText("Age:");

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblGender.setText("Gender:");

        lblSdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSdate.setText("Start Date:");

        lblLevel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLevel.setText("Level:");

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "EmployeeID", "Age", "Gender", "Start Date", "Level", "TeamInfo", "PositionTitle", "Cellphone", "Email Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplay);

        btnView.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnsearchName.setText("Search by Name");
        btnsearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchNameActionPerformed(evt);
            }
        });

        txtSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByNameActionPerformed(evt);
            }
        });

        txtSearchByEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByEmpIdActionPerformed(evt);
            }
        });

        btnSearchByEmpID.setText("Search by ID");
        btnSearchByEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByEmpIDActionPerformed(evt);
            }
        });

        btnSearchByPosTitle.setText("Search by Pos. Title");
        btnSearchByPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByPosTitleActionPerformed(evt);
            }
        });

        btnSearchByGender.setText("Gender");
        btnSearchByGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSearchByPositionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtSearchByName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnsearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearchByPosTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSearchByGender, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtSearchByEmpId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSearchByEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(btnSearchByGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(534, 534, 534)
                                .addComponent(lblPhoto)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCellphone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmailAdd, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(520, 520, 520))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblContactInfo)
                                .addGap(525, 525, 525)))
                        .addComponent(displayImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSdate)
                    .addComponent(lblGender)
                    .addComponent(lblAge)
                    .addComponent(lblEmpID)
                    .addComponent(lblName)
                    .addComponent(lblLevel)
                    .addComponent(lblTeamInfo)
                    .addComponent(lblPosTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdate, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGender)
                                .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                        .addContainerGap(1551, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnView)
                .addGap(121, 121, 121)
                .addComponent(btnDelete)
                .addGap(102, 102, 102)
                .addComponent(btnUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle1)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsearchName)
                        .addComponent(txtSearchByEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchByEmpID)
                        .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpID)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchByPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByPosTitle)
                    .addComponent(txtSearchByGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByGender))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSdate)
                    .addComponent(txtSdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoto)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeamInfo)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosTitle)
                            .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(lblContactInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCellphone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailAdd)
                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate)))
                    .addComponent(displayImg, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCellphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellphoneActionPerformed

    private void txtEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
      int selectedRowIndex= tblDisplay.getSelectedRow();
      if(selectedRowIndex <0){
          JOptionPane.showMessageDialog(this, "Please select a row for deletion");
          return ;
      }
           DefaultTableModel model =(DefaultTableModel)tblDisplay.getModel();
           
            EmployeeDetails selectedEmployee = (EmployeeDetails)model.getValueAt(selectedRowIndex, 0);
          details.deleteEmployee(selectedEmployee);
          JOptionPane.showMessageDialog(this, "Employee Record deleted");
      
  populateTable();
   txtName.setText("");
   txtEmpID. setText("");
   txtAge.setText("");
   txtGender.setText("");
   txtSdate.setText("");
   txtLevel.setText("");
   txtTeamInfo.setText("");
   txtPosTitle.setText("");
   txtCellphone.setText("");
   txtEmailAdd.setText("");
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDisplay.getSelectedRow();
        EmployeeDetails e = new EmployeeDetails();
        if (selectedRowIndex < 0) {
            
JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        
}
        

 DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
 EmployeeDetails selectedEmployee = (EmployeeDetails) model.getValueAt(selectedRowIndex, 0);
 txtName.setText(selectedEmployee.getName());  
 txtAge.setText(selectedEmployee.getAge());
 txtEmpID.setText(selectedEmployee.getEmployeeId());      
 txtGender.setText(selectedEmployee.getGender());
 txtSdate.setText(String.valueOf(selectedEmployee.getStartDate()));
 txtLevel.setText(selectedEmployee.getLevel());
 txtPosTitle.setText(selectedEmployee.getPositionTitle());
 txtTeamInfo.setText(selectedEmployee.getTeamInfo());
 txtCellphone.setText(selectedEmployee.getCellphone());
 txtEmailAdd.setText(selectedEmployee.getEmailAddress());
 //populateTable();
 displayImage();
// Image picture1 = e.getImage().getScaledInstance(174, 133, Image.SCALE_SMOOTH);
//        
// BufferedImage resizedImage1 = new BufferedImage(174, 133,BufferedImage.TYPE_INT_ARGB);
// Graphics2D g2d1 = resizedImage1.createGraphics();
// g2d1.drawImage(picture1,0,0,null);
//        
//g2d1.dispose();
//ImageIcon icon1 = new ImageIcon(resizedImage1);
//displayImg.setIcon(icon1);
        
        
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void tblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMouseClicked
        // TODO add your handling code here:
        
        
DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
String tblName = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 0).toString();
String tblEmployeeID = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 1).toString();
String tblAge = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 2).toString();
String tblGender = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 3).toString();
String tblStartDate = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 4).toString();
String tblLevel = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 5).toString();
String tblTeamInfo = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 6).toString();
String tblPositionTitle = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 7).toString();
String tblCellphone = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 8).toString();
String tblEmailAddress = tblDisplay.getValueAt(tblDisplay.getSelectedRow(), 9).toString();
//
//txtName.setText(tblName);
//txtEmptxtName.setTextID.setText(tblEmployeeID);
//txtAge.setText(tblAge);
//txtGender.setText(tblGender);
//txtSdate.setText(tblStartDate);
//txtLevel.setText(tblLevel);
//txtTeamInfo.setText(tblTeamInfo);
//txtPosTitle.setText(tblPositionTitle);
//txtCellphone.setText(tblCellphone);
//txtEmailAdd.setText(tblEmailAddress);


        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tblDisplayMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();

        if (tblDisplay.getSelectedRowCount() == 1) {
            String Name = txtName.getText();
            String EmployeeID = txtEmpID.getText();
            String Age = txtAge.getText();
            String Gender =txtGender.getText();
            String StartDate = txtSdate.getText();
            String Level = txtLevel.getText();
            String TeamInfo = txtTeamInfo.getText();
            String PosTitle = txtPosTitle.getText();
            String Cellphone = txtCellphone.getText();
            String EmailAdd = txtEmailAdd.getText();
            
            
            
            model.setValueAt(Name, tblDisplay.getSelectedRow(), 0);
            model.setValueAt(EmployeeID, tblDisplay.getSelectedRow(), 1);
            model.setValueAt(Age, tblDisplay.getSelectedRow(), 2);
            model.setValueAt(Gender, tblDisplay.getSelectedRow(), 3);
            model.setValueAt(StartDate, tblDisplay.getSelectedRow(), 4);
            model.setValueAt(Level, tblDisplay.getSelectedRow(), 5);
            model.setValueAt(TeamInfo, tblDisplay.getSelectedRow(), 6);
            model.setValueAt(PosTitle, tblDisplay.getSelectedRow(), 7);
            model.setValueAt(Cellphone, tblDisplay.getSelectedRow(), 8);
            model.setValueAt(EmailAdd, tblDisplay.getSelectedRow(), 9);
            
            JOptionPane.showMessageDialog(this, "Employee Details Updated Successfully.");
        }
        
        else{
            if (tblDisplay.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Table is empty.");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select a single row to update.");
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnsearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchNameActionPerformed
        // TODO add your handling code here:
        searchByName(txtSearchByName.getText());
    }//GEN-LAST:event_btnsearchNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        
          
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByNameActionPerformed

    private void txtSearchByEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByEmpIdActionPerformed

    private void btnSearchByEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByEmpIDActionPerformed
        // TODO add your handling code here:
        searchByEmployeeID(txtSearchByEmpId.getText());
    }//GEN-LAST:event_btnSearchByEmpIDActionPerformed

    private void btnSearchByPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByPosTitleActionPerformed
        // TODO add your handling code here:
        searchByEmployeePosition(txtSearchByPositionTitle.getText());
    }//GEN-LAST:event_btnSearchByPosTitleActionPerformed

    private void btnSearchByGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByGenderActionPerformed
        // TODO add your handling code here:
         searchByEmployeeGender(txtSearchByGender.getText());
    }//GEN-LAST:event_btnSearchByGenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchByEmpID;
    private javax.swing.JButton btnSearchByGender;
    private javax.swing.JButton btnSearchByPosTitle;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnsearchName;
    private javax.swing.JLabel displayImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellphone;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmailAdd;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblSdate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellphone;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtSdate;
    private javax.swing.JTextField txtSearchByEmpId;
    private javax.swing.JTextField txtSearchByGender;
    private javax.swing.JTextField txtSearchByName;
    private javax.swing.JTextField txtSearchByPositionTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
      model.setRowCount(0);
      
          for(EmployeeDetails emp : details.getDetails()){
              
              Object[] row = new Object[10];
              DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");             
              String dte = dateFormat.format(emp.getStartDate());
              row[0] = emp;
              row[1] = emp.getEmployeeId();
              row[2] = emp.getAge();
              row[3] = emp.getGender();
              row[4] = dte;
              row[5] = emp.getLevel();
              row[6] = emp.getTeamInfo();
              row[7] = emp.getPositionTitle();
              row[8] = emp.getCellphone();
              row[9] = emp.getEmailAddress();
              
              model.addRow(row);
              
              
          }
        
       
    }

    public void searchByName(String name) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
      
        DefaultTableModel m = (DefaultTableModel)tblDisplay.getModel();
        m.setRowCount(0);
        for(EmployeeDetails dir : details.searchEmployee(name)){
           Object[] row = new Object[10];
           row[0] = dir.getName();
           row[1] = dir.getEmployeeId();
           row[2] = dir.getAge();
           row[3] = dir.getGender();
           row[4] = dir.getStartDate();
           row[5] = dir.getLevel();
           row[6] = dir.getTeamInfo();
           row[7] = dir.getPositionTitle();
           row[8] = dir.getCellphone();
           row[9] = dir.getEmailAddress();
            
           m.addRow(row);
        }
    }
    public void displayImage(){
       //EmployeeDetails emp = new EmployeeDetails();
//        Image picture1 = emp.getImage().getScaledInstance(174, 133, Image.SCALE_SMOOTH);
//        
//        BufferedImage resizedImage1 = new BufferedImage(174, 133,BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d1 = resizedImage1.createGraphics();
//        g2d1.drawImage(picture1,0,0,null);
//    
//        g2d1.dispose();
//        ImageIcon icon1 = new ImageIcon(resizedImage1);
//        displayImg.setIcon(icon1);
           //JFileChooser browse = new JFileChooser();
       // FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Only jpg and jpeg Supported","jpeg","jpg");
        //browse.setFileFilter(extensionFilter);
        //browse.showOpenDialog(null);
        //File f = browse.getSelectedFile();
        String filename ="/Users/mrinalinijadhav/Desktop/avatar.png"; 
        //plab.setText(filename);
        Image getAbsolutePath =null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(displayImg.getWidth(),displayImg.getHeight(),Image.SCALE_SMOOTH);
        displayImg.setIcon(icon);
    }

    public void searchByEmployeeID(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel)tblDisplay.getModel();
        model.setRowCount(0);
        for(EmployeeDetails dir : details.searchEmployeeID(id)){
           Object[] row = new Object[10];
           row[0] = dir;
           row[1] = dir.getEmployeeId();
           row[2] = dir.getAge();
           row[3] = dir.getGender();
           row[4] = dir.getStartDate();
           row[5] = dir.getLevel();
           row[6] = dir.getTeamInfo();
           row[7] = dir.getPositionTitle();
           row[8] = dir.getCellphone();
           row[9] = dir.getEmailAddress();
            
           model.addRow(row);
           
    
    
    
    }
}

    private void searchByEmployeePosition(String title) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel)tblDisplay.getModel();
        model.setRowCount(0);
        for(EmployeeDetails dir : details.searchEmployeePostion(title)){
           Object[] row = new Object[10];
           row[0] = dir;
           row[1] = dir.getEmployeeId();
           row[2] = dir.getAge();
           row[3] = dir.getGender();
           row[4] = dir.getStartDate();
           row[5] = dir.getLevel();
           row[6] = dir.getTeamInfo();
           row[7] = dir.getPositionTitle();
           row[8] = dir.getCellphone();
           row[9] = dir.getEmailAddress();
            
           model.addRow(row);
    
    }
}

    private void searchByEmployeeGender(String gender) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     DefaultTableModel model = (DefaultTableModel)tblDisplay.getModel();
        model.setRowCount(0);
        for(EmployeeDetails dir : details.searchEmployeeGender(gender)){
           Object[] row = new Object[10];
           row[0] = dir;
           row[1] = dir.getEmployeeId();
           row[2] = dir.getAge();
           row[3] = dir.getGender();
           row[4] = dir.getStartDate();
           row[5] = dir.getLevel();
           row[6] = dir.getTeamInfo();
           row[7] = dir.getPositionTitle();
           row[8] = dir.getCellphone();
           row[9] = dir.getEmailAddress();
            
           model.addRow(row);
    
    
    }
    }
    
}
    

