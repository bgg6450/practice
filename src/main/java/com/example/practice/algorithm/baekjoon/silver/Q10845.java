package com.example.practice.algorithm.baekjoon.silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            switch (s) {
                case "front" -> System.out.println(queue.isEmpty() ? -1 : queue.getFirst());
                case "back" -> System.out.println(queue.isEmpty() ? -1 : queue.getLast());
                case "empty" -> System.out.println(queue.isEmpty() ? 1 : 0);
                case "size" -> System.out.println(queue.size());
                case "pop" -> System.out.println(queue.isEmpty() ? -1 : queue.poll());
                default -> queue.add(Integer.parseInt(s.split(" ")[1]));
            }
        }
    }
}
