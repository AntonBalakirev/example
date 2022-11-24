package com.company;

public class Cat {
    String name;
    int age;
    boolean hasTail;

//    public Cat(){
//    }

    public Cat(){
        this.name = "Timur";
        this.age = 5;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, boolean hasTail){
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    public void sayMoew() {
        System.out.println("Мяу!");
    }

    public String sayMurr() {
        return "Мурр!";
    }

    public void multipleNumbers(int one, int two) {
        System.out.println("Результат умножения: " + one * two);
    }

    public int returnMultipleNumbers(int one, int two) {
        return one * two;
    }
}
