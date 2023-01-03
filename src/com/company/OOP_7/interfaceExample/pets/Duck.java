package com.company.OOP_7.interfaceExample.pets;

import com.company.OOP_7.interfaceExample.Flyable;

public class Duck extends Pet implements Flyable {
    public Duck(){
        this.name = "Donald";
        this.age = 1;
    }

    @Override
    public void say() {
        System.out.println("Кря!");
    }

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
