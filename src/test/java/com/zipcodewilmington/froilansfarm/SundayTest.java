package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.BooFarmStorage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.BooFarmStorage.Stable;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Foods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Foods.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SundayTest {

    @Test
    public void testPlantingCrops(){
        CropRow cropRow1 = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow1.addCrop(tomatoPlant);
        ArrayList<Crop> expected = new ArrayList<>();
        expected.add(tomatoPlant);
        assertEquals(expected,cropRow1.getCrops());
    }
    @Test
    public void testPlantingCrops2(){
        CropRow cropRow2 = new CropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow2.addCrop(cornStalk);
        ArrayList<Crop> expected = new ArrayList<>();
        expected.add(cornStalk);
        assertEquals(expected,cropRow2.getCrops());
    }

    @Test
    public void testPlantingCrops3(){
        CropRow cropRow3 = new CropRow();
        RandomCrop randomCrop = new RandomCrop();
        cropRow3.addCrop(randomCrop);
        ArrayList<Crop> expected = new ArrayList<>();
        expected.add(randomCrop);
        assertEquals(expected,cropRow3.getCrops());
    }
}
