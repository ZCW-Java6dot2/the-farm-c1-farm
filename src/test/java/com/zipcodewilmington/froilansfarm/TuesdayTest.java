package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuesdayTest {

    @Test
    public void operateTractorTest() {
        Tractor tractor = new Tractor();
        String expected = "potatopotatopotato";
        String actual = tractor.operate();
        assertEquals(expected, actual);
    }

    @Test
    public void harvestTest() {
        Tractor tractor = new Tractor();
        boolean expected = true;
        boolean actual = tractor.harvest();
        assertEquals(expected, actual);
    }

    @Test
    public void noiseMakerTest() {
        Tractor tractor = new Tractor();
        String expected = "assorted loud noises";
        String actual = tractor.makeNoise();
        assertEquals(expected, actual);


    }
}
