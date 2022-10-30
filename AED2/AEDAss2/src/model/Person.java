/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author rajmehta
 */
public class Person {
    
    private String name;
    private int age;
    private LocalDate dob;
    private long contactNo;
    private String comm;
    
    public Person(){}
    //Create a person
    public Person(long contactNo,String name,LocalDate dob, String comm){
       
        this.name = name;
        this.contactNo = contactNo;
        this.age = calculateAge(dob);
        this.dob = dob;
        this.comm = comm;       
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

        
    public int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public long getContactNo() {
        return contactNo;
    }

    public boolean matchByName(String name) {
        
        return this.getName().equals(name);
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
