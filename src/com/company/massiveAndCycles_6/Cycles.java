package com.company.massiveAndCycles_6;

public class Cycles {
    public static void main(String[] args) {
        for (int i = 10; i > 5; i--) {
            System.out.println("Текущее значение i: " + i);
        }

        int number = 5;
        while (number > 0){
            System.out.println("Текущее значение number: " + number);
            number--;
        }

        do {
            System.out.println("Текущее значение doNumber: " + number);
            number++;
        } while (number < 5);
    }
}
