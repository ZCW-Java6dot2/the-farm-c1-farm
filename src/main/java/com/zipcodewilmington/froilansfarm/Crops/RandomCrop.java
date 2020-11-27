package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Foods.RandomFood;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class RandomCrop extends Crop {

    public RandomFood yield() {
        RandomFood randomFood = new RandomFood();
        return randomFood;
    }
}
