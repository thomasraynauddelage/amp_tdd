package com.example.amp.service;

/**
 * Created by txrdelage on 17/02/16.
 */
public class CalculationService {
    public static double getPrice(double width, double length, double weight, String destination){
        if(width < 90 || width > 270){
            throw new IllegalArgumentException("Width must be between 90mm and 270mm");
        }
        if(length < 140 || length > 380){
            throw new IllegalArgumentException("Length must be between 140mm and 380mm");
        }
        if(weight<3 || weight > 500){
            throw new IllegalArgumentException("Weight must be between 3.0g and 500.0g");
        }

        return 0.0;
    }
}
