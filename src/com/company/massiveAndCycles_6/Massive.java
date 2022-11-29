package com.company.massiveAndCycles_6;

public class Massive {
    public static void main(String[] args) {
        String monday = "Monday";
        String tuesday = "Tuesday";
        String wednesday = "Wednesday";
        String thursday = "Thursday";

        String[] week = new String[7];
        week[0] = monday;
        week[1] = tuesday;
        week[2] = wednesday;
        week[3] = thursday;
        week[3] = "Thorsday";

        System.out.println(week[3]);

        int[][] coordinates = new int[10][10];
        coordinates[0][1] = 3;
        coordinates[4][5] = 6;
    }
}
