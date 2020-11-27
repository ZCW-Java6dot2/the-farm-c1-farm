package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

public class Farmer extends Person implements Botanist {

    public Farmer(String name) {
        super(name);
    }

    public void plant() {

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat() {
        return "Nom nom nom";
    }
    public void mount(Rideable rideable) {

    }
    public void dismount(Rideable rideable) {
    }
    public boolean feed(Integer numOfCrop, Edible edible){
        if(numOfCrop == 3 && edible instanceof Edible ){
            return true;
        }
        return false;
    }

}
