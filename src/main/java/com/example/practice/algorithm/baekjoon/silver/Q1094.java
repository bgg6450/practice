package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int std = 64;
        int count = 0;
        while (true) {
            if (i >= std) {
                i -= std;
                count++;
            }
            if (i == 0) {
                System.out.println(count);
                break;
            }
            std /= 2;
        }
    }
}
