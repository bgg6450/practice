package com.example.practice.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OX 퀴즈. 정답률 50%
 */
public class Q_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            String[] l = bf.readLine().split("");
            int result = 0;
            int score = 0;
            for (String s : l) {
                if (s.equals("X")) {
                    score = 0;
                } else {
                    score++;
                    result += score;
                }
            }
            System.out.println(result);
        }
    }
}
