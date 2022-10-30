/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author rajmehta
 */
public class Encounter {
    VitalSigns vital;
    private LocalDate lastVisitDate;
    private long id;
    static long count = 0;

    public Encounter(VitalSigns vital) {
        this.lastVisitDate = LocalDate.now();
        this.vital = vital;
        count = count + 1;
        this.id = count;    
    }

    public VitalSigns getVital() {
        return vital;
    }

    public void setVital(VitalSigns vital) {
        this.vital = vital;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Encounter.count = count;
    }
    
    
}
