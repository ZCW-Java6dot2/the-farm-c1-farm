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
    Farmer froilan = new Farmer("froilan");
    Pilot froilanda = new Pilot("froilanda");
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();
    Field field = new Field();
    ChickenCoop coop1 = new ChickenCoop();
    ChickenCoop coop2 = new ChickenCoop();
    ChickenCoop coop3 = new ChickenCoop();
    ChickenCoop coop4 = new ChickenCoop();
    CropDuster cropDuster = new CropDuster();
    Tractor tractor = new Tractor();

    @Before
    public void setUp()
    {
        stable1.addHorses(3);
        stable2.addHorses(5);
        stable3.addHorses(2);
        coop1.addChickens(5);
        coop1.addChickens(5);
        coop1.addChickens(3);
        coop1.addChickens(2);
        field.addCropRows(5);

    }

    @Test
    public void testRideHorses(){
        for(int i = 0; i < stable1.stableSize();i++){
            froilan.mount(stable1.getHorses().get(i));
            froilan.dismount(stable1.getHorses().get(i));
            assertTrue(stable1.getHorses().get(i) instanceof Rideable);
        }
        assertTrue(froilan instanceof Rider);
        }
    @Test
    public void testEater(){
        assertTrue(froilan instanceof Eater);
    }
    @Test
    public void testFeedHorses() {
        EarOfCorn earOfCorn = new EarOfCorn();
        for (int i = 0; i < stable1.stableSize(); i++) {
            assertTrue(froilan.feed(3, earOfCorn));
        }
    }
    @Test
    public void testBreakfastFroilanda(){
        String expected = "I'm Froilanda and I'm eatttttting";
        String actual = froilanda.eat();
        assertEquals(expected,actual);
    }
    @Test
    public void testBreakfastFroilan(){
        String expected = "Nom nom nom";
        String actual = froilan.eat();
        assertEquals(expected,actual);
    }
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
