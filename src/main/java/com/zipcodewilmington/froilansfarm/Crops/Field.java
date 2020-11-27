package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow> cropRows = new ArrayList<>();

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
    public void addCropRows(Integer numOfRows){
        for(int i = 0; i < numOfRows; i++){
            CropRow cropRow = new CropRow();
            cropRows.add(cropRow);
        }
    }
    public Integer fieldSize() {
        return this.cropRows.size();
    }
}
