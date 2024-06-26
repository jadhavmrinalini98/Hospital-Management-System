/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Community;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Hospital;

/**
 *
 * @author Mrinalini
 */
public class ViewCommunity extends javax.swing.JPanel {

    /**
     * Creates new form SystemViewHospital
     */

    public ViewCommunity() {
        initComponents();
        initCityCmbx();
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
        lblSearchHospital = new javax.swing.JLabel();
        btnSearchHospital = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalList = new javax.swing.JTable();
        comboCity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 153, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Community");

        lblSearchHospital.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchHospital.setText("View Community By City :");

        btnSearchHospital.setText("Search");
        btnSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHospitalActionPerformed(evt);
            }
        });

        tblHospitalList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Community Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospitalList);

        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(comboCity, 0, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHospitalActionPerformed
        // TODO add your handling code here
        
//        populateDataByHospitalName();
    }//GEN-LAST:event_btnSearchHospitalActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchHospital;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchHospital;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblHospitalList;
    // End of variables declaration//GEN-END:variables

//    private void PopulateData() {
//       try{
//            Set<Hospital> hospitals = hospitalDirectory.getHospitals();
//            DefaultTableModel model = new DefaultTableModel(new Object[]{ "Hospital Id", "Hospital Name", "Hospital Address", "City","Community"}, 0);
//            if(hospitals!= null && !hospitals.isEmpty()){
//              
//                for(Hospital h: hospitals){           
//                    
//                    String hospName = h.getHospitalName();
//                    String hospAddress = h.getHospitalAddress();
//                    Community community = h.getCommunity();
//                    String city = null;
//                    String communityName = null;
//                    
//                    Map<String,String> communityMap = community.getCommunity();
//                    
//                    for(Map.Entry m: communityMap.entrySet()){  
//                        city = m.getKey().toString();
//                        communityName = m.getValue().toString();
//                    }  
//                    
//                    model.addRow(new Object[]
//                        {h,hospName,hospAddress,city,communityName});       
//                }
//            }
//            tblHospitalList.setModel(model);
//            
//       }
//       catch(Exception e)
//       {
//           System.out.println(e);
//       }    
//    }
    
    
    private void initCityCmbx() {
       comboCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City city_ : cities) {
            comboCity.addItem(cities[count++].toString());
        }
        
        populateData();
    }

    private void populateData() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{ "Hospital Id"},0);
    }
//    public void generateDropdown() {
//        ArrayList<String> cityDropdown = new ArrayList<>();
//        for (String cityValue : City.cityValues) {
//            cityDropdown.add(String.valueOf(cityValue));
//        }
//        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
//        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
//        cityJComboBox.setModel(yearsSDropdownModel);
//    }

//    public void updateTable() {
//         DefaultTableModel model = new DefaultTableModel(new Object[]{ "Hospital Id"},0);
//        model.setRowCount(0);
//        for (int i = 0; i < City.allCities.size(); i++) {
//            Object[] row = {Community.};
//            model.addRow(row);
//        }
//    }
}