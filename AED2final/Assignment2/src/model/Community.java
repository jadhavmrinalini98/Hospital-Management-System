/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mrinalini
 */
public class Community{
      
    
    EnumMap<City, String[]> LstCommunity = new EnumMap<>(City.class);
    Map<String, String> Community = new HashMap<>();
    
    public EnumMap<City, String[]> getLstCommunity() {
        return LstCommunity;
    }

    public void setLstCommunity() {
        LstCommunity.put(City.NewYork, new String[]{ "Manhattan", "Queens", "Bronx","Brooklyn" });
        LstCommunity.put(City.Boston, new String[]{"Burlington", "Union Square", "Arlington", "South Sation"});
        LstCommunity.put(City.SouthernCalifornia, new String[]{"Los Angeles", "Santa Barbara", "San Diego"});
        LstCommunity.put(City.Austin, new String[]{"Downtown", "Caldwell", "Williamson","Kenney"});
    }

    public Map<String, String> getCommunity() {
        return Community;
    }

    public void setCommunity(Map<String, String> Community) {
        this.Community = Community;
    }
}
