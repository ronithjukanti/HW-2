package com.company;

public class Truck extends Vehicle {
    private char hasSideStep;
    private String TowCapacity;

    public Truck(String make, String model, String model_year,char four_Wheel_drive, int price, int milage,
                 char hasSideStep, String towCapacity)
    {
        super(make, model, model_year, four_Wheel_drive, price, milage);
        this.hasSideStep = hasSideStep;
        this.TowCapacity = towCapacity;
    }

    public char getHasSideStep() {
        return hasSideStep;
    }

    public void setHasSideStep(char hasSideStep) {
        this.hasSideStep = hasSideStep;
    }

    public String getTowCapacity() {
        return TowCapacity;
    }

    public void setTowCapacity(String towCapacity) {
        this.TowCapacity = towCapacity;
    }

    public void printVehicle() {
        super.printVehicle();
        if(hasSideStep=='Y'){
            System.out.println("Has a side step");
        }else{
            System.out.println("No Side Step");
        }
        System.out.println("Tow capacity "+TowCapacity);
    }

}
