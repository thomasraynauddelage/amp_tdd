package com.example.amp;
import com.example.amp.service.CalculationService;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by txrdelage on 17/02/16.
 */
public class CalculationServiceTest {

    @Test
    public void properInputSyntaxTest(){

    }

    @Test
    public void improperInputSyntaxTest(){

    }

    @Test
    public void properRangeWidthInputTest(){
        CalculationService.getPrice(100,150,30,"Canada");
    }

    @Test(expected=IllegalArgumentException.class)
    public void widthTooLowInputTest(){
        CalculationService.getPrice(10,150,30,"Canada");
    }

    @Test(expected=IllegalArgumentException.class)
    public void widthTooHighInputTest(){
        CalculationService.getPrice(280,150,30,"Canada");
    }

    @Test
    public void properRangeLengthInputTest(){
        CalculationService.getPrice(100,150,30,"Canada");
    }

    @Test(expected=IllegalArgumentException.class)
    public void lengthTooLowInputTest(){
        CalculationService.getPrice(100,130,30,"Canada");

    }

    @Test(expected=IllegalArgumentException.class)
    public void lengthTooHighInputTest(){
        CalculationService.getPrice(100,500,30,"Canada");

    }

    @Test
    public void properRangeWeightInputTest(){
        CalculationService.getPrice(100,150,30,"Canada");
    }

    @Test (expected=IllegalArgumentException.class)
    public void weigthTooLowInputTest(){
        CalculationService.getPrice(100,150,2,"Canada");
    }

    @Test (expected=IllegalArgumentException.class)
    public void weigthTooHighInputTest(){
        CalculationService.getPrice(100,150,550,"Canada");
    }





}
