package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Foods.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WednesdayTest {

    @Test
    public void testEggYield(){
        Chicken chicken = new Chicken();
        Egg egg = chicken.yield();

        assertTrue(egg instanceof Edible);
        assertTrue(chicken instanceof Producer);
    }
}
