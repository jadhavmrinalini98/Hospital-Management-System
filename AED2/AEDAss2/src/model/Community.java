/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rajmehta
 */
public class Community {
    
    private ArrayList<House> houseList;
    private ArrayList<Hospital> hospitalList;
    private String commName;

    public void setCommName(String commName) {
        this.commName = commName;
    }
    
    public Community(){}
    
    public Community(String commName){
        this.houseList = new ArrayList<>();
        this.hospitalList = new ArrayList<>();
        this.commName = commName;
    }
    
     public ArrayList<House> getHouseList() {
        return houseList;
    }
    
    public House findPersonInCommunity(Person person){
    
        for(House house:this.getHouseList())
        
            if(house.getFamiliyMembers().contains(person))
                return house;
    
         return null;
    }
    
    public ArrayList<Doctor> findDoctorInCommunity(Doctor doctor){
    
        for(Hospital hospital:this.getHospitalList())
        
            return hospital.getDoctorHospital();

         return null;
    }
    
    
    public House createHouse(int houseNum,String streetName,String community,String city){
        
        House newHouse = new House( houseNum,  streetName,
                  community, city);
        this.getHouseList().add(newHouse);
        return newHouse;
        
    }
    
    public Hospital createHospital(int hospNum,String streetName, String community,String city){
        
        Hospital newHospital = new Hospital( hospNum, streetName,community, city);
        this.getHospitalList().add(newHospital);
        return newHospital;
        
    }

    public String getCommName() {
        return commName;
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    
    
    @Override
    public String toString() {
        return commName;
    }
    
     
}
