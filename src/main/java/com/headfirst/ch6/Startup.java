package com.headfirst.ch6;

import java.util.ArrayList;

class Startup {
    private ArrayList<String> locationCells;
    private String name;

    void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }

    public void setName(String name) {
        this.name = name;
    }

    String checkYourself(Integer userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch you sunk " + name + "     :  (");
            }
            else
                result = "hit";
        }
        return result;
    }
}
