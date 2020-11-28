package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.BooFarmStorage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.BooFarmStorage.Stable;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Foods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneralTests {
    Farmer froilan = new Farmer("Froilan");
    Pilot froilanda = new Pilot("Froilanda");
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
    public void testStable(){
        Integer expected = 10;
        Integer actual = stable1.stableSize()+stable2.stableSize()+stable3.stableSize();
        assertEquals(expected,actual);
    }
    @Test
    public void testChickenCoop(){
        Integer expected = 15;
        Integer actual = coop1.coopSize() + coop2.coopSize() + coop3.coopSize() + coop4.coopSize();
        assertEquals(expected,actual);
    }
    @Test
    public void testField(){
        Integer expected = 5;
        Integer actual = field.fieldSize();
        assertEquals(expected,actual);
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

}

//Every morning, Froilan and Froilanda begin their morning by
//Riding each Horse in each Stable.
//Feeding each Horse 3 ear of Corn.
//For breakfast,
//Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
//Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
