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
public class PatientDirectory {
     ArrayList<Patient> patientList;
     
     public PatientDirectory(){
        
        patientList = new ArrayList<Patient>();
//        this.syst = syst;   
    }
     
     public Patient getPatientById(int id){
        
       for(Patient p: patientList){
            
            if(p.matchById(id)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
        
    }
    
    public Patient createPatient(Person person){
        
        //Create person
        Patient newPatient = new Patient(person);
        
        //Add created person to a list
        patientList.add(newPatient);
        
        return newPatient;
        
    }
    
    public Patient searchPatientByName(String name){
        
        for(Patient p: patientList){
            
            if(p.matchByName(name)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
}
