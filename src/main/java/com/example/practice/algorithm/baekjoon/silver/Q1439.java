package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 뒤집기. 정답률 55.6%
 */
public class Q1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int countZero = 0;
        int countOne = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else countOne++;
            }
        }
        if (s.charAt(0) == '0') {
            countZero++;
        } else countOne++;
        System.out.println(Math.min(countOne, countZero));
    }
}
