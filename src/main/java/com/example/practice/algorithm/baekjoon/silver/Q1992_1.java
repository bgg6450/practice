package com.example.practice.algorithm.baekjoon.silver;

import java.util.Scanner;

public class Q1992_1 {

    public static StringBuilder result = new StringBuilder();
    public static int[][] img;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        img = new int[N][N];

        QuadTree(0, 0, N);
    }

    private static void QuadTree(int x, int y, int size) {
        if (isPossible(x, y, size)) {
            result.append(img[x][y]);
            return;
        }
        int newSize = size / 2;

    }

    private static boolean isPossible(int x, int y, int size) {
        for (int i = x; x < size; i++) {

        }
        return false;
    }
}
