package com.zipcodewilmington.froilansfarm.BooFarmStorage;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickens = new ArrayList<>();

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    public void addChickens(Integer numOfChickens){
        for(int i = 0; i < numOfChickens; i++){
            Chicken chicken = new Chicken();
            chickens.add(chicken);
        }
    }
    public Integer coopSize(){
        return this.chickens.size();
    }
}
