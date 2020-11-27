package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Foods.Tomato;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> crops = new ArrayList<>();

    public ArrayList<Crop> getCrops() {
        return crops;
    }

    public void setCrops(ArrayList<Crop> crops) {
        this.crops = crops;
    }
    public void addCrop(Crop crop){
        crops.add(crop);
        }

    public Integer crops() {
        return this.crops.size();
    }

}
