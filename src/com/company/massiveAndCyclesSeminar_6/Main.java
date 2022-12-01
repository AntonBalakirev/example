package com.company.massiveAndCyclesSeminar_6;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        boolean hasSame;
        for (int i = 0; i < randomArray.length; i++) {
            int random = (int) (Math.random() * 100);
            //проверка на наличие в массиве такого же числа
            hasSame = true;
            while (hasSame) {
                hasSame = false;
                for (int j = 0; j < i; j++) {
                    if (randomArray[j] == random) {
                        hasSame = true;
                        random++;
                    }
                }
            }
            //добавление нового элемента
            randomArray[i] = random;
            System.out.println(randomArray[i]);
        }
    }
}
