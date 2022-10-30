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
public class DoctorDirectory {
    ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        doctorList = new ArrayList<Doctor>();
    }
    
    public void addDoctor(Doctor doctor){
        doctorList.add(doctor);
    }
    
    public Doctor createDoctor(Person person){
        Doctor newDoctor = new Doctor(person);
        doctorList.add(newDoctor);
        return newDoctor;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    
}
