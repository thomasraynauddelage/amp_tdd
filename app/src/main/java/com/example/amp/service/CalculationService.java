package com.example.amp.service;

/**
 * Created by txrdelage on 17/02/16.
 */
public class CalculationService {

    public static double getPrice(double width, double length, double weight, String destination, String type) {
        double price = 0.00;
        if(width < 90 || width > 270){
            throw new IllegalArgumentException("Width must be between 90mm and 270mm");
        }
        if(length < 140 || length > 380){
            throw new IllegalArgumentException("Length must be between 140mm and 380mm");
        }
        if(weight<3 || weight > 500){
            throw new IllegalArgumentException("Weight must be between 3.0g and 500.0g");
        }
        if(!destination.equals("Canada") && !destination.equals("United States") && !destination.equals("International")){
            throw new IllegalArgumentException("Not a valid destination");
        }
        if(!type.toLowerCase().equals("stamp") && !type.toLowerCase().equals("meter") && !type.toLowerCase().equals("postal indicia")){
            throw new IllegalArgumentException("Not a valid type of item");
        }
        if(weight < 30){
            if(type.toLowerCase().equals("stamp")) {
                price = 1.00;
            }
            else{
                price = 0.80;
            }
        }
        else if(weight < 50){
            if(type.toLowerCase().equals("stamp")) {
                price = 1.20;
            }
            else{
                price = 1.19;
            }

        }
        else if(weight<100){
            price = 5.90;
        }
        return price;

    }
}
