/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.util.regex.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_NUMPAD9;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.EmployeeDetails;
import model.EmployeeHistory;


/**
 *
 * @author bhawnabassarmalani
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    

    /**
     * Creates new form CreateJPanel
     */
    private BufferedImage image;
    EmployeeHistory details;
    public CreateJPanel(EmployeeHistory details) {
        initComponents();
        
        
        this.details= details;
        
    }
    private Boolean checkBlankInput()
    {
        if(txtName.getText().length()==0||txtAge.getText().length()==0||txtEmpID.getText().length()==0||txtGender.getText().length()==0||txtSdate.getText().length()==0||txtLevel.getText().length()==0||txtTeamInfo.getText().length()==0||txtPosTitle.getText().length()==0||txtCellphone.getText().length()==0||txtEmailAdd.getText().length()==0)
                
        {
            return false;
        }
        else{
            return true;
        }
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
        lblName = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblSdate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblCellphone = new javax.swing.JLabel();
        lblEmailAdd = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtCellphone = new javax.swing.JTextField();
        txtEmailAdd = new javax.swing.JTextField();
        btnUploadPhoto = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtSdate = new javax.swing.JFormattedTextField();
        txtGender = new javax.swing.JTextField();
        clab = new javax.swing.JLabel();
        nlab = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        plab = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee Records");

        lblName.setText("Name:");

        lblEmpID.setText("Employee ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblSdate.setText("Start Date:");

        lblLevel.setText("Level:");

        lblContactInfo.setText("Contact Info:");

        lblPosTitle.setText("Posn. Title:");

        lblTeamInfo.setText("Team Info:");

        lblCellphone.setText("Cellphone:");

        lblEmailAdd.setText("Email Address:");

        lblPhoto.setText("Photo:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtEmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIDKeyPressed(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtCellphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellphoneActionPerformed(evt);
            }
        });
        txtCellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCellphoneKeyReleased(evt);
            }
        });

        txtEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddActionPerformed(evt);
            }
        });
        txtEmailAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailAddKeyReleased(evt);
            }
        });

        btnUploadPhoto.setText("Upload Photo");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtSdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        txtSdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSdateKeyPressed(evt);
            }
        });

        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
        });

        clab.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        clab.setForeground(new java.awt.Color(255, 0, 51));

        nlab.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        nlab.setForeground(new java.awt.Color(255, 0, 51));

        elab.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        elab.setForeground(new java.awt.Color(255, 0, 51));

        plab.setText("Image:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGender)
                            .addComponent(lblAge)
                            .addComponent(lblEmpID)
                            .addComponent(lblName)
                            .addComponent(lblPhoto)
                            .addComponent(lblLevel)
                            .addComponent(lblSdate)
                            .addComponent(lblTeamInfo)
                            .addComponent(lblPosTitle)
                            .addComponent(lblContactInfo)
                            .addComponent(lblCellphone)
                            .addComponent(lblEmailAdd))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(plab, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(txtSdate))
                                .addGap(18, 18, 18)
                                .addComponent(nlab, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(elab, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clab, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSdate)
                            .addComponent(txtSdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevel)))
                    .addComponent(lblGender))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosTitle)
                    .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lblContactInfo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCellphone)
                    .addComponent(clab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAdd)
                    .addComponent(elab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(btnUploadPhoto)
                    .addComponent(plab))
                .addGap(54, 54, 54)
                .addComponent(btnSave)
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCellphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellphoneActionPerformed

    private void txtEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if(checkBlankInput()){
        String name = txtName.getText();
        String id = txtEmpID.getText();
        String age = txtAge.getText();
        String Gender = txtGender.getText();
        String startDate= txtSdate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String posTitle = txtPosTitle.getText();
        String mobile = txtCellphone.getText();
        String email = txtEmailAdd.getText();



        EmployeeDetails emp = details.addNewEmployee();
        emp.setName(name);
        emp.setEmployeeId(id);
        emp.setAge(age);
        emp.setGender(Gender);
        emp.setStartDate(new Date());
        emp.setLevel(level);
        emp.setTeamInfo(teamInfo);
        emp.setPositionTitle(posTitle);
        emp.setCellphone(mobile);
        emp.setEmailAddress(email);
        
//        emp.setPhoto


   JOptionPane.showMessageDialog(this, "New Employee Record Saved");
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
        }
        else{
            JOptionPane.showMessageDialog(this, "Please fill all fields");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        String PATTERN="^[A-Za-z][A-Za-z0-9_]{7,29}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtName.getText());
        if(!match.matches()){
            nlab.setText("Name is incorrect!!");
        }
        else{
            nlab.setText(null);
        }
       
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtEmpIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIDKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if((key>=evt.VK_0 && key<=evt.VK_9)|| (key>=evt.VK_NUMPAD0 && key<=VK_NUMPAD9||key==KeyEvent.VK_BACK_SPACE)){
            txtEmpID.setEditable(true);
            
        }
        else{
            txtEmpID.setEditable(false);
            
        }
    }//GEN-LAST:event_txtEmpIDKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if((key>=evt.VK_0 && key<=evt.VK_9)|| (key>=evt.VK_NUMPAD0 && key<=VK_NUMPAD9||key==KeyEvent.VK_BACK_SPACE)){
            txtEmpID.setEditable(true);
            
        }
        else{
            txtEmpID.setEditable(false);
            
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
        
        
       
    
        
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtSdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSdateKeyPressed
        // TODO add your handling code here:
        
       
    
    }//GEN-LAST:event_txtSdateKeyPressed

    private void txtEmailAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAddKeyReleased
        // TODO add your handling code here:
        String PATTERNMail="^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
        Pattern patt= Pattern.compile(PATTERNMail);
        Matcher match=patt.matcher(txtEmailAdd.getText());
        if(!match.matches()){
            elab.setText("Email is not in correct format!!");
        }
        else{
            elab.setText(null);
        }
    }//GEN-LAST:event_txtEmailAddKeyReleased

    private void txtCellphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellphoneKeyReleased
        // TODO add your handling code here:
        String PATTERN="\\d{10}|(?:\\\\d{3}-){2}\\\\d{4}|\\\\(\\\\d{3}\\\\)\\\\d{3}-?\\\\d{4}";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtCellphone.getText());
        if(!match.matches()){
            clab.setText("Enter correct Cellphone Number");
        }
        else{
            clab.setText(null);
        }
       
    }//GEN-LAST:event_txtCellphoneKeyReleased

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        // TODO add your handling code here:
        EmployeeDetails e= new EmployeeDetails();
        JFileChooser browse = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Only jpg and jpeg Supported","jpeg","jpg");
        browse.setFileFilter(extensionFilter);
        browse.showOpenDialog(null);
        File f = browse.getSelectedFile();
        String filename = f.getName();
        plab.setText(filename);
        image = new BufferedImage(100,100,BufferedImage.TYPE_INT_ARGB);
        
        try {
            image = ImageIO.read(f);
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(this,"Profile Not created");
     //       Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.setImage(image);
    }//GEN-LAST:event_btnUploadPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JLabel clab;
    private javax.swing.JLabel elab;
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
    private javax.swing.JLabel nlab;
    private javax.swing.JLabel plab;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellphone;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JFormattedTextField txtSdate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
