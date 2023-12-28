package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        Queue<Integer> queue = new LinkedList<>();

        while (queue.size() > 1) {
            if (queue.size() > k) {
                queue.offer(queue.poll());

            }
        }
        System.out.println();

//        output
//        1 2 3 4 5 6 7
//        (3) 4 5 6 7 1 2
//        (6) 7 1 2 4 5
//        (2) 4 5 7 1
//        (7) 1 4 5
//        (5) 1 4
//        (1) 4
//        (4)
    }
}
