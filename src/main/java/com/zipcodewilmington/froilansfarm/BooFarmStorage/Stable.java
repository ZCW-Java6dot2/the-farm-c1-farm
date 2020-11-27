package com.zipcodewilmington.froilansfarm.BooFarmStorage;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable {
   private ArrayList<Horse> horses = new ArrayList<>();

   public Stable(){

   }
   public void addHorses(Integer numOfHorses){
       for(int i = 0; i < numOfHorses; i++){
           Horse horse = new Horse();
           horses.add(horse);
       }
   }
   public ArrayList<Horse> getHorses(){
       return this.horses;
   }
   public Integer stableSize(){
       return this.horses.size();
   }
}
