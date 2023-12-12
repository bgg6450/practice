package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[1]);
            arr[i][1] = Integer.parseInt(s[0]);
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            }
            else {
                return o1[1] - o2[1];
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int[] i : arr) {
            sb.append(i[1]).append(" ").append(i[0]).append("\n");
        }
        System.out.println(sb);
    }

}
