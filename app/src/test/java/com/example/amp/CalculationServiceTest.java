package com.example.amp;
import com.example.amp.service.CalculationService;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by txrdelage on 17/02/16.
 */
public class CalculationServiceTest {

    @Test(expected=IllegalArgumentException.class)
    public void widthTooLowInputTest(){
        CalculationService.getPrice(10,150,30,"Canada","stamp");
    }

    @Test(expected=IllegalArgumentException.class)
    public void widthTooHighInputTest(){
        CalculationService.getPrice(280,150,30,"Canada","stamp");
    }

    @Test(expected=IllegalArgumentException.class)
    public void lengthTooLowInputTest(){
        CalculationService.getPrice(100,130,30,"Canada","stamp");

    }

    @Test(expected=IllegalArgumentException.class)
    public void lengthTooHighInputTest(){
        CalculationService.getPrice(100,500,30,"Canada","stamp");

    }

    @Test (expected=IllegalArgumentException.class)
    public void weigthTooLowInputTest(){
        CalculationService.getPrice(100,150,2,"Canada","stamp");
    }

    @Test (expected=IllegalArgumentException.class)
    public void weigthTooHighInputTest(){
        CalculationService.getPrice(100,150,550,"Canada","stamp");
    }

    @Test (expected=IllegalArgumentException.class)
    public void improperInputDestination(){
        CalculationService.getPrice(100,150,30,"Brazil","stamp");
    }

    @Test (expected=IllegalArgumentException.class)
    public void improperInputType(){
        CalculationService.getPrice(100,150,30,"Canada","package");
    }

    @Test
    public void properInput(){
        CalculationService.getPrice(100,150,30,"Canada","stamp");
    }
}

