/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rajmehta
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        hospitalList = new ArrayList<Hospital>();
    }

    
    public Hospital createHospital(int hospNum,String streetName, String community,String city){
        Hospital newHospital = new Hospital(hospNum, streetName, community, city);
        hospitalList.add(newHospital);
        return newHospital;
    }
    
    public void addHospital(Hospital hospital){
        this.getHospitalList().add(hospital);
    }
    
    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    
}
