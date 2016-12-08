package com.company;

public class Car extends Vehicle{
    private char IsitConvertible;


    public Car(String make, String model, String model_year,
               char four_Wheel_drive, int price, int milage,char isitConvertible) {
        super(make, model, model_year, four_Wheel_drive, price, milage);
        IsitConvertible = isitConvertible;
    }



    public char getIsitConvertible() {
        return IsitConvertible;
    }



    public void setisitConvertible(char isitConvertible) {
        IsitConvertible = isitConvertible;
    }



    public void printVehicle() {
        super.printVehicle();
        if(IsitConvertible=='Y'){
            System.out.println("It is Convertible");
        }else{
            System.out.println("It is not Convertible");
        }

    }

}
