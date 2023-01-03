package com.company.OOP_7.interfaceExample.pets;

public class Cat extends Pet {
    public Cat(){
        this.name = "Timur";
        this.age = 5;
    }

    @Override
    public void say() {
        System.out.println("Мяу!");
    }
}
