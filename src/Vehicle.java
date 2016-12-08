package com.company;

public class Vehicle {

    private String Make;
    private String Model;
    private String Model_year;
    private char four_Wheel_drive;
    private int price;
    private int Milage;


    public Vehicle(String make, String model, String model_year,char four_Wheel_drive, int price, int milage)
    {
        super();
        this.Make = make;
        this.Model = model;
        this.Model_year = model_year;
        this.four_Wheel_drive = four_Wheel_drive;
        this.price = price;
        this.Milage = milage;
    }


    public String getMake() {
        return Make;
    }


    public void setMake(String make) {
        Make = make;
    }


    public String getModel() {
        return Model;
    }


    public void setModel(String model) {
        Model = model;
    }


    public String getModel_year() {
        return Model_year;
    }


    public void setModel_year(String model_year) {
        Model_year = model_year;
    }


    public char getFour_Wheel_drive() {
        return four_Wheel_drive;
    }


    public void setFour_Wheel_drive(char four_Wheel_drive) {
        this.four_Wheel_drive = four_Wheel_drive;
    }



    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public int getMilage() {
        return Milage;
    }


    public void setMilage(int milage) {
        Milage = milage;
    }


    public void printVehicle() {
        System.out.println(Model_year+" "+Make+ " "+Model);
        if(four_Wheel_drive=='Y'){
            System.out.println("4WD");
        }else{
            System.out.println("Not a 4WD");
        }
        System.out.println(price);
        System.out.println("$"+price);
        System.out.println(Milage+"MPG");
    }
}

