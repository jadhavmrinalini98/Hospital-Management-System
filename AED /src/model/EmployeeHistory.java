/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jadhavmrinalini
 */
public class EmployeeHistory {
    
    private ArrayList<EmployeeDetails> details;
    
    public EmployeeHistory(){
        this.details = new ArrayList<EmployeeDetails>();
        
    };

    public ArrayList<EmployeeDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<EmployeeDetails> details) {
        this.details = details;
    }
    public EmployeeDetails addNewEmployee(){
        EmployeeDetails newEmployee = new EmployeeDetails();
        details.add(newEmployee);
        return newEmployee;
    }
    
    
    public void deleteEmployee(EmployeeDetails employee){
        details.remove(employee);
        
    }
    public ArrayList<EmployeeDetails> searchEmployee(String name)
    {
        ArrayList<EmployeeDetails> searchEmployee = new ArrayList();
        for(EmployeeDetails employee: details)
        {
            if(employee.getName().equals(name))
            {
                if(employee.getName()!=null)
                {
                    searchEmployee.add(employee);
                }
            }
        }
        return searchEmployee;
    }  
    
    
}
