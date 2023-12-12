package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long i = 0;
        while (n > std(i)) {
            i++;
        }
        if (n == std(i)) {
            System.out.println(i);
        } else {
            System.out.println(i-1);
        }
    }

    public static long std(long n) {
        return n * (n + 1) / 2;
    }
}
