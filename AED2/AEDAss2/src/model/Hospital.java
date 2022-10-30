/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rajmehta
 * 
 */
public class Hospital {
    private int hospNum;
    private String streetName;
    private String community;
    private String city;
    private long zipcode;
    ArrayList<Doctor> doctorHospital;
    
    public Hospital(){}
    
    public Hospital (int hospNum,String streetName, String community,String city){
        this.hospNum = hospNum;      
        this.streetName = streetName;
        this.community = community;
        this.city = city;      
        this.doctorHospital=new ArrayList<Doctor>();
    }
    
    public void addDoctorToHospital(Doctor doctor){
        
        this.getDoctorHospital().add(doctor);
    }

    public int getHospNum() {
        return hospNum;
    }

    public void setHospNum(int hospNum) {
        this.hospNum = hospNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public ArrayList<Doctor> getDoctorHospital() {
        return doctorHospital;
    }

    public void setDoctorHospital(ArrayList<Doctor> doctorHospital) {
        this.doctorHospital = doctorHospital;
    }
    
    
}
