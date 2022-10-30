/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rajmehta
 */
public class Doctor {
    private long id;
    Person person;
    static long count = 0;
    String docPass;
//    EncounterHistory encounterHistory;
    
    public Doctor(Person person){   
        count += 1;
        this.id = count;
        this.person = person;
        this.docPass = (person.getName()).concat("123");
    }

    public String getDocPass() {
        return docPass;
    }

    public void setDocPass(String docPass) {
        this.docPass = docPass;
    }
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Doctor.count = count;
    }
    
    public boolean matchByName(String name){
        
        return this.person.matchByName(name);
    }
    
    public boolean matchById(int id){
        
        return this.getId() == id;
    }
    
    
}
