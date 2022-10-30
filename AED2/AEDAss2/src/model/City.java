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
public class City {
    String citName;
    ArrayList<Community> commList;
    
    public City(String citName){
        this.commList = new ArrayList<Community>();
        this.citName = citName;
    }
    
    public Community newCommunity(String commName){
        Community comm = new Community(commName);
        this.commList.add(comm);
        return comm;
    }

    public Community getCommByObject(Community commName){
        
        for(Community comm: this.getCommList()){
            
            if(comm.getCommName().equals(commName)){
                return comm;
            }
        }
        
        return null;
    }
    
    public boolean CommunityExists(String commName){
        
        for(Community comm: this.getCommList()){
            
            if(comm.getCommName().equals(commName)){
                return true;
            }
        }
        
        return false;
    }

    public String getCitName() {
        return citName;
    }

    public void setCitName(String citName) {
        this.citName = citName;
    }

    public ArrayList<Community> getCommList() {
        return commList;
    }

    public void setCommList(ArrayList<Community> commList) {
        this.commList = commList;
    }

    @Override
    public String toString() {
        return citName;
    }
    
    
    
    
}
