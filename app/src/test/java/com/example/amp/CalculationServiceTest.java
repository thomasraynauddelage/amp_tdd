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
        CalculationService.getPrice(80,150,30,"Canada","stamp");
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
    //
    @Test (expected=IllegalArgumentException.class)
    public void weigthTooHighInputTest(){
        CalculationService.getPrice(100,150,550,"Canada","stamp");
    }
    //
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
    public void stampForNonStandardLetterLessThan100gToCanadaTest() {
        assert (CalculationService.getPrice(100, 150, 70, "Canada", "stamp") == 1.80);
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
        assert (CalculationService.getPrice(100,150,250,"Canada","meter")==3.89);
    }
    @Test
    public void stampForNonStandardLetterBetween300And400gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,350,"Canada","stamp")==4.70);
    }
    @Test
    public void meterForNonStandardLetterBetween300And400gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,350,"Canada","meter")==4.42);
    }

    @Test
    public void postalIndiciaForNonStandardLetterBetween300And400gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,350,"Canada","postal indicia")==4.42);
    }
    @Test
    public void stampForNonStandardLetterBetween400And500gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,450,"Canada","stamp")==5.05);
    }

    @Test
    public void meterForNonStandardLetterBetween400And500gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,450,"Canada","meter")==4.74);
    }
    @Test
    public void postalIndiciaForNonStandardLetterBetween400And500gToCanadaTest(){
        assert (CalculationService.getPrice(100,150,450,"Canada","postal indicia")==4.74);
    }
    @Test
    public void stampForStandardLetterLessThan30gToUnitedStatesTest(){
        assert (CalculationService.getPrice(100,150,5,"United States","stamp")==1.20);
    }
    @Test
    public void MeterOrPostalIndiciaForStandardLetterLessThan30gToUnitedStatesTest(){
        assert (CalculationService.getPrice(100,150,5,"United States","meter")==1.19);
    }
    @Test
    public void stampForStandardLetterBetween30gTo50ToUnitedStatesTest(){
        assert (CalculationService.getPrice(100,150,35,"United States","stamp")==1.80);
    }
    @Test
    public void MeterOrPostalIndiciaForStandardLetterBetween30gTo50ToUnitedStatesTest(){
        assert (CalculationService.getPrice(100,150,35,"United States","meter")==1.72);
    }
    @Test
    public void stampForNonStandardLetterUpTo100gToUnitedStatesTest() {
        assert (CalculationService.getPrice(100, 150, 70, "United States", "stamp") == 2.95);
    }
    @Test
    public void MeterOrPostalIndiciaForNonStandardLetterUpTo100gToUnitedStatesTest() {
        assert (CalculationService.getPrice(100, 150, 70, "United States", "postal indicia") == 2.68);
    }
    @Test
    public void stampForNonStandardLetterBetween100gUpTo200ToUnitedStatesTest(){
        assert (CalculationService.getPrice(100,150,135,"United States","stamp")==5.15);
    }
    @Test
    public void MeterOrPostalIndiciaForNonStandardLetterFrom100UpTo200gToUnitedStatesTest() {
        assert (CalculationService.getPrice(100, 150, 170, "United States", "postal indicia") == 4.85);
    }
    @Test
    public void stampForNonStandardLetterBetween200gUpTo500ToUnitedStatesTest(){
        assert (CalculationService.getPrice(100,150,435,"United States","stamp")==10.30);
    }
    @Test
    public void MeterOrPostalIndiciaForNonStandardLetterFrom200UpTo500gToUnitedStatesTest() {
        assert (CalculationService.getPrice(100, 150, 470, "United States", "postal indicia") == 9.69 );
    }
    @Test
    public void stampForStandardLetterUpTo30gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,5,"International","stamp")==2.50);
    }
    @Test
    public void MeterOrPostalIndiciaForStandardLetterUpTo30gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,5,"International","meter")==2.36);
    }
    @Test
    public void stampForStandardLetterFrom30gTo50gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,35,"International","stamp")==3.60);
    }
    @Test
    public void MeterOrPostalForStandardLetterFrom30gTo50gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,35,"International","meter")==3.42);
    }
    @Test
    public void stampForNonStandardLetterUpTp100gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,65,"International","stamp")==5.90);
    }
    @Test
    public void MeterOrPostalForNonStandardLetterUpTp100gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,65,"International","meter")==5.56);
    }
    @Test
    public void stampForNonStandardLetterFrom100gUpTo200gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,165,"International","stamp")==10.30);
    }
    @Test
    public void MeterOrPostalForNonStandardLetterFrom100gUpTo200gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,165,"International","meter")==9.69);
    }
    @Test
    public void stampForNonStandardLetterFrom200gUpTo500gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,465,"International","stamp")==20.60);
    }
    @Test
    public void MeterOrPostalForNonStandardLetterFrom200gUpTo500gToInternationalTest(){
        assert (CalculationService.getPrice(100,150,465,"International","meter")==19.39);
    }


}


