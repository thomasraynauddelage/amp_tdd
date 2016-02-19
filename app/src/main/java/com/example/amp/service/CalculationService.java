package com.example.amp.service;

/**
 * Created by txrdelage on 17/02/16.
 */
public class CalculationService {

    public static double getPrice(double width, double length, double weight, String destination, String type) {
        double price = 0.00;
        //checking if the width is between 90 and 270
        if(width < 90||width > 270){
            throw new IllegalArgumentException("Width must be between 90mm and 270mm");
        }// checking if the length is between 140 and 380
        if(length < 140 || length > 380 ){
            throw new IllegalArgumentException("Length must be between 140mm and 380mm");
        }//checking if the weight is between 3 to 500
        if(weight<3 || weight > 500){
            throw new IllegalArgumentException("Weight must be between 3.0g and 500.0g");
        }//checking  the destination input
        if(!destination.equals("Canada") && !destination.equals("United States") && !destination.equals("International")){
            throw new IllegalArgumentException("Not a valid destination");
        }// checking the item input
        if(!type.toLowerCase().equals("stamp") && !type.toLowerCase().equals("meter") && !type.toLowerCase().equals("postal indicia")){
            throw new IllegalArgumentException("Not a valid type of item");
        }// if it is within canada
        if (destination.equals("Canada")) {
            if (weight <= 30 && width<= 156 && length <=245) {//checking weight width and length
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.00;
                }
                else {
                    price = 0.80;
                }
            }
            else if (weight <= 50 && width<=156 && length <=245) {//checking weight width and length
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.20;
                }
             else {
                    price = 1.19;
                }
            }
            else if (weight <= 100) {//checking weight
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.80;
                }
                else {
                    price = 1.71;
                }
            }
            else if (weight <= 200) {//checking weight
                if (type.toLowerCase().equals("stamp")) {
                    price = 2.95;
                }
                else {
                    price = 2.77;
                }
            }
            else if (weight <= 300) {//checking weight
                if (type.toLowerCase().equals("stamp")) {
                    price = 4.10;
                }
                else {
                    price = 3.89;
                }
            }
            else if (weight <= 400) {//checking weight
                if (type.toLowerCase().equals("stamp")) {
                    price = 4.70;
                }
                else {
                    price = 4.42;
                }
            }
            else if (weight <= 500) {//checking weight
                if (type.toLowerCase().equals("stamp")) {
                    price = 5.05;
                }
                else {
                    price = 4.74;
                }
            }
        }
        else if (destination.equals("United States")){//checking if it is going to United States
            if (weight<=30 && width<= 156 && length <=245){//checking weight width and length
                if (type.toLowerCase().equals("stamp")) {
                    price = 1.20;
                }
                else {
                    price =1.19;
                }
            }
            else if  (weight<=50 && width<= 156 && length <=245){//checking weight
                if (type.toLowerCase().equals("stamp")){
                    price =1.80;
                }
                else {
                    price=1.72;
                }
            }
            else if (weight<=100){//checking weight
                if (type.toLowerCase().equals("stamp")){
                    price =2.95;
                }
                else {
                    price = 2.68;
                }
            }
            else if (weight<=200){//checking weight
                if (type.toLowerCase().equals("stamp")){
                    price=5.15;
                }
                else{
                    price = 4.85;
                }
            }
            else if (weight<=500){//checking weight
                if(type.toLowerCase().equals("stamp")){
                    price = 10.30;
                }
                else {
                    price = 9.69;
                }
            }

        }
        else if (destination.equals("International")){//checking if it is international mail
            if (weight<=30 && width<= 156 && length <=245){//checking weight width and length
                if(type.toLowerCase().equals("stamp")){
                    price= 2.50;
                }
                else {
                    price = 2.36;
                }
            }
            else if (weight<=50 && width<= 156 && length <=245){//checking weight width and length
                if(type.toLowerCase().equals("stamp")){
                    price = 3.60;
                }
                else {
                    price =  3.42;
                }

            }
            else if (weight<=100){//checking weight
                if (type.toLowerCase().equals("stamp")){
                    price = 5.90;
                }
                else {
                    price = 5.56;
                }
            }
            else if (weight<=200){//checking weight
                if (type.toLowerCase().equals("stamp")){
                    price = 10.30;
                }
                else {
                    price = 9.69;
                }
            }
            else if (weight<=500){//checking weight
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
