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
public class MainSystem {
    
    private ArrayList<City> cityList;

    public MainSystem() {
        this.cityList = new ArrayList<City>();
    }

    
    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public City addCity(String cityName){
        City city = new City(cityName);
        cityList.add(city);
        return city;
    }
    
    public void removeCity(City city){
        cityList.remove(city);
    }
    
    
}
