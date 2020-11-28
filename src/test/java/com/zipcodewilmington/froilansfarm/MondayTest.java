package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MondayTest {
    CropDuster cd = new CropDuster();

    @Test
    public void fertilizeTest(){
        boolean expected = true;
        boolean actual = cd.fertilize();
        assertEquals(expected, actual);
    }

    @Test
    public void testCropDusterOperate(){
        String expected = "vrooooooom!";
        String actual = cd.operate();
        assertEquals(expected, actual);
    }

    @Test
    public void flyTest() {
        String expected = "I am flying!";
        String actual = cd.fly();
        assertEquals(expected, actual);
    }


}
