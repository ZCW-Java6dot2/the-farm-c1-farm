package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {
    public String operate() {
        return "vrooooooom!";

    }
    public boolean fertilize(){
        return true;
    }
}
