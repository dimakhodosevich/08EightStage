package by.itstep.khodosevich.eightproject.task03;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.task03.module.logic.Age.*;

public class TestAge {

    @Test
    public void testGetStringAgePositiveOne(){
        double actual_age = 1;
        String expected = "Один";

        String actual = getStringAge(actual_age);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetStringAgePositiveTwo(){
        double actual_age = 19;
        String expected = "Девятнадцать";

        String actual = getStringAge(actual_age);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetStringAgePositiveTree(){
        double actual_age = 21;
        String expected = "Двадцать один";

        String actual = getStringAge(actual_age);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetStringAgePositiveFour(){
        double actual_age = 100;
        String expected = "Сто лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetStringAgePositiveFive(){
        double actual_age = 119;
        String expected = "Сто девятнадцать лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected,actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetStringAgeNegativeOne(){
        double actual_age = -1;
        String actual = getStringAge(actual_age);
    }

    @Test(expected = RuntimeException.class)
    public void testGetStringAgeNegativeTwo(){
        double actual_age = 121;
        String actual = getStringAge(actual_age);
    }




}
