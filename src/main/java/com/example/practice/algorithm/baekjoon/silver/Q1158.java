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
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n+1; i++) {
            queue.offer(i);
        }
        int k = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
