package com.company.massiveAndCycles_6;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        int firstNumber = 10;
        int secondNumber = 20;

        // true && true = true
        // false || true = true
        // true || false = true
        // true || true = true

        if(firstNumber < secondNumber){
            System.out.println("Сработало первое условие");
        } else if (firstNumber > secondNumber) {
            System.out.println("Сработало второе условие");
        } else {
            System.out.println("Числа равны");
        }

        String str1 = "Monday";
        String str2 = "Tuesday";
        String str3 = "Wednesday";
        String str4 = "Thursday";

        String str = "Sunday";

        if(str.equals(str1)){
            System.out.println("Сработало первое условие");
        } else if (str.equals(str2)) {
            System.out.println("Сработало второе условие");
        } else if (str.equals(str3)){
            System.out.println("Сработало третье условие");
        } else if (str.equals(str4)){
            System.out.println("Сработало четвертое условие");
        } else {
            System.out.println("Выходной");
        }

        switch(str) {
            case "Monday":
                System.out.println("Сработало первое условие");
                break;
            case "Tuesday":
                System.out.println("Сработало второе условие");
                break;
            case "Wednesday":
                System.out.println("Сработало третье условие");
                break;
            case "Thursday":
                System.out.println("Сработало четвертое условие");
                break;
            default:
                System.out.println("Выходной");
        }

        int num = 8;
        switch (num){
            case 8 :
                System.out.println("Число 8");
                num++;
//                break;
            case 10 :
                System.out.println("Число 10");
                break;
            default:
                System.out.println("Такого числа нет");
        }

        System.out.println(num);
    }
}