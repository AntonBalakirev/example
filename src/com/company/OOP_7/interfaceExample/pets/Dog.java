package com.company.OOP_7.interfaceExample.pets;

public class Dog extends Pet {
    public Dog(){
        this.name = "Barbos";
        this.age = 2;
    }

    @Override
    public void say() {
        System.out.println("Гав!");
    }
}
