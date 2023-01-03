package com.company.OOP_7.interfaceExample.airplane;

import com.company.OOP_7.interfaceExample.Flyable;

public class Boing757 extends Aircraft implements Flyable {
    public Boing757(){
        this.id = "7233510RD";
        int age = 10;
        int crewNumber = 6;
        String companyOwner = "LOT";
        String flightNumber = "566D";
    }

    @Override
    void boarding() {
        System.out.println("Заходим в самолет по трапу");
    }

    @Override
    public void takeoff() {
        System.out.println("Закрылки в положение взлет, дать газ");
    }

    @Override
    public void fly() {

    }

    @Override
    public void landing() {

    }
}
