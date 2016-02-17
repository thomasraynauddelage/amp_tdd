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

    @Test
    public void stampForStandardLetterLessThan30gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,5,"Canada","stamp")==1.00);
    }

    @Test
    public void meterForStandardLetterLessThan30gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,5,"Canada","meter")==0.80);
    }

    @Test
    public void postalIndiciaForStandardLetterLessThan30gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,5,"Canada","postal indicia")==0.80);
    }

    @Test
    public void stampForStandardLetterBetween30gand50gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,40,"Canada","stamp")==1.20);
    }

    @Test
    public void meterForStandardLetterBetween30gand50gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,40,"Canada","meter")==1.19);
    }

    @Test
    public void postalIndiciaForStandardLetterBetween30gand50gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,40,"Canada","postal indicia")==1.19);
    }

    @Test
    public void stampForNonStandardLetterLessThan100gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,70,"Canada","stamp")==1.80);
    }

    @Test
    public void meterForNonStandardLetterLessThan100gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,70,"Canada","meter")==1.71);
    }

    @Test
    public void postalIndiciaForNonStandardLetterLessThan100gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,70,"Canada","postal indicia")==1.71);
    }

    @Test
    public void stampForNonStandardLetterBetween100And200gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,150,"Canada","stamp")==2.95);
    }

    @Test
    public void meterForNonStandardLetterBetween100And200gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,150,"Canada","meter")==2.77);
    }

    @Test
    public void postalIndiciaForNonStandardLetterBetween100And200gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,150,"Canada","postal indicia")==2.77);
    }

    @Test
    public void stampForNonStandardLetterBetween200And300gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,250,"Canada","stamp")==4.10);
    }

    @Test
    public void meterForNonStandardLetterBetween200And300gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,250,"Canada","stamp")==3.89);
    }


}

