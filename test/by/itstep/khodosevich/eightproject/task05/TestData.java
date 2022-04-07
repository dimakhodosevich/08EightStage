package by.itstep.khodosevich.eightproject.task05;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.lask05.module.logic.Data.*;

public class TestData {

    @Test
    public void testGetDayOfMonthPositive(){
        int[] actual_numbersOfMonth = {1,2,3,4,5,6,7,8,9,10,11,12};
        int expected = 365;
        int actual = 0;

        for(int element: actual_numbersOfMonth){
            actual += getDayOfMonth(element);
        }

        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testGetDayOfMonthNegativeOne(){
        int actual_number = 0;
        getDayOfMonth(actual_number);
    }

    @Test (expected = RuntimeException.class)
    public void testGetDayOfMonthNegativeTwo(){
        int actual_number = 13;
        getDayOfMonth(actual_number);
    }


}
