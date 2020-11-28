package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public abstract class Person implements Eater, Rider {
    protected String name;


    public Person(String name){
        this.name = name;
    }



    public String eat() {
        return "Nom nom nom";
    }

    public void mount() {

    }
    public void dismount() {
    }
}
