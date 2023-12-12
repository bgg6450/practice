package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            List<String> e = new ArrayList<>();
            List<String> l = Arrays.stream(br.readLine().split("")).toList();
            for (int j = 0; j < l.size(); j++) {
                if (j == 0) {
                    e.add(l.get(0));
                } else {
                    if (!l.get(j).equals(l.get(j-1))) {
                        if (e.contains(l.get(j))) {
                            count += 1;
                            break;
                        } else {
                            e.add(l.get(j));
                        }
                    }
                }
            }
        }
        System.out.println(n - count);
    }
}
