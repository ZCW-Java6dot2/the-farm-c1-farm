package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable {
    ArrayList<Horse> horses = new ArrayList<>();



    public void rideAll(){
        //loop through all horse and invoke the
        //methods mount/dismount on each horse
        // if we've done that return true
    }
}
