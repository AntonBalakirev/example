package com.company.massiveAndCycles_6;

import java.util.ArrayList;

public class DinamicArray {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
