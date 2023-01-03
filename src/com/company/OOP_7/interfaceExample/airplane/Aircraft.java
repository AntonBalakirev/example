package com.company.OOP_7.interfaceExample.airplane;

public abstract class Aircraft {
    String id;
    int age;
    int crewNumber;
    String companyOwner;
    String flightNumber;

    abstract void boarding();

    void getFuel(){
        System.out.println("Заправка самолета");
    }
}
