package com.example.practice.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 브론즈4
 * 삼각형 외우기. 정답률 57%
 */
public class Q10101 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        if (a + b + c != 180) {
            System.out.println("Error");
        } else {
            if (a == b && a == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
