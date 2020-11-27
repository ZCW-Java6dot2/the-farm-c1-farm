package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Foods.Tomato;

public class TomatoPlant extends Crop {
    public Tomato yield() {
        Tomato tomato = new Tomato();
        return tomato;
    }
}
