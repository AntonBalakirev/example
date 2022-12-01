package com.company.massiveAndCyclesSeminar_6;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {

        //заполнение массива рандомными значениями
        int mathRandom = (int)(Math.random()*10);
        Random randomizer = new Random();
        int randRandom = randomizer.nextInt();
        int randRandomBound = randomizer.nextInt(10);
        System.out.println(mathRandom);
        System.out.println(randRandom);
        System.out.println(randRandomBound);

        int[] randomArray = new int[10];
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomizer.nextInt(10);
            System.out.println("Значение массива: " + randomArray[i]);
        }

        //поиск максимального значения
        int maxValue = 0;
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] > maxValue){
                maxValue = randomArray[i];
            }
            System.out.println("Максимальное значение: " + maxValue);
        }

        //поиск четных чисел
        int[] evenArray = new int[10];
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] % 2 == 0 && randomArray[i] != 0){
                evenArray[i] = randomArray[i];
                System.out.println("Четное значение: " + randomArray[i]);
            }
        }
    }
}
