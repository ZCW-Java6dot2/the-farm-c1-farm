package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Foods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThursdayTest {
    Farmer farmer = new Farmer("Froilan");

    @Test
    public void plantTest() {
        boolean expected = true;
        boolean actual = farmer.plant();

        assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "Froilan";
        String actual = farmer.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        Farmer farmer1 = new Farmer("");
        farmer1.setName("Froilanda");
        String expected = "Froilanda";
        assertEquals(expected, farmer1.getName());
    }

    @Test
    public void feed(){
        EarOfCorn ear = new EarOfCorn();
        boolean actual = farmer.feed(4, ear);
        assertFalse(actual);

    }

    @Test
    public void testPerson(){
        Pilot pilot = new Pilot("Froilanda");

        assertTrue(pilot instanceof Person);
    }
}