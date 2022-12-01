package com.company.massiveAndCyclesSeminar_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //Создать список ArrayList(динамический массив), заполнить строками, вводимыми пользователем через консоль (до 10 штук).
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arrayList.add(scanner.nextLine());
        }
        System.out.println(arrayList);

        //Вывести в консоль строку, содержащую заглавную букву
        for (String item : arrayList) {
            if (Character.isUpperCase(item.charAt(0))) {
                System.out.println(item);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (Character.isUpperCase(arrayList.get(i).charAt(0))) {
                System.out.println(arrayList.get(i));
            }
        }
    }


}
