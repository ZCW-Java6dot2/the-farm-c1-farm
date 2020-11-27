package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Foods.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

public class Chicken extends Animal implements Producer {
    public Egg yield() {
        Egg egg = new Egg();
        return egg;
    }
}
