/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author rajmehta
 */
public class PersonDirectory {
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        
        personList = new ArrayList<Person>();
//        this.syst = syst;   
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPersonToDirectory(Person person){
        personList.add(person);
    }
           
    public Person createPerson(long contactNo, String name, LocalDate dob, String comm){
        
        //Create person
        Person newPerson = new  Person(contactNo, name,dob, comm);
        
        //Add created person to a list
        personList.add(newPerson);
        return newPerson;

    }
    
}
