/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mrinalini
 */
public class DoctorDirectory {
    
    private Set<Doctor> doctors = new HashSet<>();

    public DoctorDirectory() {
        
        House house = new House();
        Community community = new Community();
                    
        house.setHouseNum(23);
        house.setStreet("Smith St");
                    
        Map<String,String>communities=new HashMap<>();
        communities.put("Boston","Burlington");
        community.setCommunity(communities);
        house.setCommunity(community);
       
        Doctor d = new Doctor("Bhawna",Long.parseLong("7678017675"), "bb@g.com",28, "Female", house, 1989, new Date(), DoctorSpecialization.DiagnosticRadiology,1001,"bhawna");
       
        this.doctors.add(d);
    }
    
    
    

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addNewDoctor(Person doctor)
    {
        doctors.add((Doctor) doctor);
    }  
    
     public void deleteDoctor(Doctor selectedPatient) {
        doctors.remove(selectedPatient);
    }
    
}
