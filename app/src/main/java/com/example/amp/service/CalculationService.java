package com.example.amp.service;

/**
 * Created by txrdelage on 17/02/16.
 */
public class CalculationService {

    public static double getPrice(double width, double length, double weight, String destination, String type) {
        double price = 0.00;

        if(width < 90||width > 270){
            throw new IllegalArgumentException("Width must be between 90mm and 270mm");
        }
        if(length < 140 || length > 380 ){
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
        if (destination.equals("Canada")) {
            if (weight <= 30 && width<= 156 && length <=245) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.00;
                }
                else {
                    price = 0.80;
                }
            }
            else if (weight <= 50 && width<=156 && length <=245) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.20;
                }
             else {
                    price = 1.19;
                }
            }
            else if (weight <= 100) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.80;
                }
                else {
                    price = 1.71;
                }
            }
            else if (weight <= 200) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 2.95;
                }
                else {
                    price = 2.77;
                }
            }
            else if (weight <= 300) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 4.10;
                }
                else {
                    price = 3.89;
                }
            }
            else if (weight <= 400) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 4.70;
                }
                else {
                    price = 4.42;
                }
            }
            else if (weight <= 500) {
                if (type.toLowerCase().equals("stamp")) {
                    price = 5.05;
                }
                else {
                    price = 4.74;
                }
            }
        }
        else if (destination.equals("United States")){
            if (weight<=30 && width<= 156 && length <=245){
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.20;
                }
                else {
                    price =1.19;
                }
            }
            else if  (weight<=50 && width<= 156 && length <=245){
                if (type.toLowerCase().equals("stamp")){
                    price =1.80;
                }
                else {
                    price=1.72;
                }
            }
            else if (weight<=100){
                if (type.toLowerCase().equals("stamp")){
                    price =2.95;
                }
                else {
                    price = 2.68;
                }
            }
            else if (weight<=200){
                if (type.toLowerCase().equals("stamp")){
                    price=5.15;
                }
                else{
                    price = 4.85;
                }
            }
            else if (weight<=500){
                if(type.toLowerCase().equals("stamp")){
                    price = 10.30;
                }
                else {
                    price = 9.69;
                }
            }

        }
        else if (destination.equals("International")){
            if (weight<=30 && width<= 156 && length <=245){
                if(type.toLowerCase().equals("stamp")){
                    price= 2.50;
                }
                else {
                    price = 2.36;
                }
            }
            else if (weight<=50 && width<= 156 && length <=245){
                if(type.toLowerCase().equals("stamp")){
                    price = 3.60;
                }
                else {
                    price =  3.42;
                }

            }
            else if (weight<=100){
                if (type.toLowerCase().equals("stamp")){
                    price = 5.90;
                }
                else {
                    price = 5.56;
                }
            }
            else if (weight<=200){
                if (type.toLowerCase().equals("stamp")){
                    price = 10.30;
                }
                else {
                    price = 9.69;
                }
            }
            else if (weight<=500){
                if (type.toLowerCase().equals("stamp")){
                    price = 20.60;
                }
                else {
                    price =19.39;
                }
            }

        }

        return price;

    }
}
