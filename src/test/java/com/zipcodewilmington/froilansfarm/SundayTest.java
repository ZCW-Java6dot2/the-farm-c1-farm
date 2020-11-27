package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class SundayTest {
    @Test
    public void SundayTestRidingHorses(){
        ArrayList<Horse> horses = new ArrayList<>();//put 10 horses in List
        boolean actual = horses.rideAll();


        assertTrue(actual);

        //10 horse objects
        //3 stable objects
        // mount/dismount on each horse from each stable
    }
}

//Every morning, Froilan and Froilanda begin their morning by
//Riding each Horse in each Stable.
//Feeding each Horse 3 ear of Corn.
//For breakfast,
//Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
//Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
