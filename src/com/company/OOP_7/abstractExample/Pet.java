package com.company.OOP_7.abstractExample;

public abstract class Pet {
        String name;
        int age;

        abstract void say();

        void move(){
                System.out.println("Позвать питомца");
        }
}
