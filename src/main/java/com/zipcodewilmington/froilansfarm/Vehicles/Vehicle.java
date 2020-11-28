package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Vehicle implements NoiseMaker, Rideable {
    public String makeNoise() {
        return "assorted loud noises";

    }

}
