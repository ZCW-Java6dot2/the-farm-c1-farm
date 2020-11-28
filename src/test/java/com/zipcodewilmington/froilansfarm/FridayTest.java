package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Foods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Foods.Food;
import com.zipcodewilmington.froilansfarm.Foods.Tomato;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FridayTest {

    @Test
    public void testFertilize(){
        Food food = new Food();
        boolean expected = true;
        boolean actual = food.hasBeenFertilized();
        assertEquals(expected, actual);

    }

    @Test
    public void  testHarvest(){
        Food food = new Food();
        boolean expected = true;
        boolean actual = food.hasBeenHarvested();
        assertEquals(expected, actual);
    }

    @Test
    public void testCornStalk(){
        CornStalk cs = new CornStalk();

        assertTrue(cs instanceof Crop);
    }

    @Test
    public void testSetCrop(){
        CropRow cr = new CropRow();
        TomatoPlant tp = new TomatoPlant();
        ArrayList<Crop> tpList = new ArrayList<>();
        tpList.add(tp);
        cr.setCrops(tpList);
        ArrayList<Crop> actual = cr.getCrops();

        assertEquals(tpList, actual);

    }

}
