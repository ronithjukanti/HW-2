package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory  {

    Scanner sc=new Scanner((System.in));
    int priceA=5000;
    int priceF=2000;
    int priceB=4000;
    int priceH=3000;

    List al=new ArrayList();

    public List<String> add()
    {
        System.out.println("Begining of Inventory class");
        System.out.println("Enter the vehicle to be added ");
        String vehicle=sc.next();
        al.add("Audi");
        al.add("BMW");
        al.add("Ford");
        al.add("Honda city");
        al.add(vehicle);
        System.out.println("The elements of array list are "+al);
        return null;
    }
    public void remove()
    {
        System.out.println("Enter the number of the car to be removed");
        int rmv=sc.nextInt();
        al.remove(rmv);
        System.out.println("The updated array list is as follows: "+al);
    }

    public void cheap()
    {
        if(priceA<priceB && priceA<priceF && priceA<priceH)
        {
            System.out.println("The cheapest vehicle is "+al.get(0));
        }
        else if(priceB<priceA && priceB<priceF && priceB<priceH)
        {
            System.out.println("The cheapest vehicle is "+al.get(1));
        }
        else if (priceF<priceA && priceF<priceB && priceF<priceH)
        {
            System.out.println("The cheapest vehicle is "+al.get(2));
        }
        else if(priceH<priceA && priceH<priceB && priceH<priceF)
        {
            System.out.println("The cheapest vehicle is "+al.get(3));
        }

    }
    public void expensive()
    {
        if(priceA>priceB && priceA>priceF && priceA>priceH)
        {
            System.out.println("The expensive vehicle is "+al.get(0));
        }
        else if(priceB>priceA && priceB>priceF && priceB>priceH)
        {
            System.out.println("The expensive vehicle is "+al.get(1));
        }
        else if (priceF>priceA && priceF>priceB && priceF>priceH)
        {
            System.out.println("The expensive vehicle is "+al.get(2));
        }
        else if(priceH<priceA && priceH<priceB && priceH<priceF)
        {
            System.out.println("The expensive vehicle is "+al.get(3));
        }

    }
    public void average()
    {
        double average=(priceA+priceB+priceF)/al.size();
        System.out.println("The average price of all vehicles are"+average);
    }
    public void inventory()
    {
        Inventory inv=new Inventory();
        inv.add();
        inv.remove();
        inv.cheap();
        inv.expensive();
        inv.average();
    }

}
