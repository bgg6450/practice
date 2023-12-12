package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q1340 {

    private static final int DAY_TIME = 24 * 60 * 60;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        getTimeBeforeToday(input[1]);


        Map<String, Integer> month = new HashMap<>();
        month.put("January", 31);
        month.put("February", 28);
        month.put("March", 31);
        month.put("April", 30);
        month.put("May", 31);
        month.put("June", 30);
        month.put("July", 31);
        month.put("August", 31);
        month.put("September", 30);
        month.put("October", 31);
        month.put("November", 30);
        month.put("December", 31);

    }

    private static int getTimeBeforeToday(String month) {
        String s = month.substring(0, 2);
        if (s.startsWith("0")) {
            return Integer.parseInt(s.substring(1, 2)) - 1 ;
        }
        return Integer.parseInt(s);
    }

    static int getTotalTime(String year) {
        boolean leapYear = isLeapYear(Integer.parseInt(year));
        if (leapYear) {
            return 365 * DAY_TIME;
        }
        else {
            return 366 * DAY_TIME;
        }
    }

    static boolean isLeapYear(int year) {
       if (year % 400 == 0) {
           return true;
       }
        return year % 4 == 0 && year % 100 != 0;
    }



}
