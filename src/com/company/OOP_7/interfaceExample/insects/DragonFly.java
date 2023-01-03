package com.company.OOP_7.interfaceExample.insects;

import com.company.OOP_7.interfaceExample.Flyable;

public class DragonFly implements Flyable {
    @Override
    public void takeoff() {
        System.out.println("Вмах крыла");
    }

    @Override
    public void fly() {

    }

    @Override
    public void landing() {

    }
}
