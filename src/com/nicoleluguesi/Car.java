package com.nicoleluguesi;

class Car {
    //fields
    public String make;
    public String model;
    public int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void chooseCar() {
        System.out.println("You have chosen the " + year +" "+ make +" "+ model+".");
    }
}





//Create a car class with at least 3 properties
//Create at least 2 methods
//Create 2 other classes that inherit from the car class.