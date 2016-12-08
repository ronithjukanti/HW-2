package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Car[] car_array =  new Car[3];
        car_array[0]= new Car("Maruthi", "Baleno", "2016", 'N', 150000, 25, 'N');
        car_array[1]= new Car("BMW", "C-34", "2014", 'Y', 1100000, 15, 'Y');
        Truck[] truck_array =new Truck[2];
        truck_array[0] =new Truck("A&N", "Sweedish truck", "2016", 'Y', 50000, 10, 'Y',"3 tons");
        truck_array[1] =new Truck("A&N", "Dutch Truck", "2012", 'Y', 35000, 10, 'N',"3 tons");
        for(int i=0;i<truck_array.length;i++) {
            car_array[i].printVehicle();
            truck_array[i].printVehicle();
        }
        Inventory inv=new Inventory();
        inv.inventory();

        List<Vehicle> vlist=new ArrayList<Vehicle>();
        vlist.add(car_array[1]);
        vlist.add(truck_array[1]);



    }

}
