package com.nicoleluguesi;

public class Main {

public static void main(String[] args) {
    // create new instance of class
       var rental = new Economy("Toyota", "Yaris", 2009, "grey");
     System.out.println("You have chosen the "+  rental.make + " "+ rental.model +" "+ rental.year +" "+ rental.color );

       // System.out.println(" I am a test");

       Economy nicoleRental = new Economy("Honda", "Fit", 2015, "blue");
        nicoleRental.chooseCar();
        //nicoleRental.chooseCar();
        //nicoleRental.color = "black";

        //rental.chooseCar();
        //nicoleRental.chooseCar();
    }
}

