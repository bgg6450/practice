package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            while (s.length() != 0) {
                String ns = s.replace("()", "");
                if (ns.length() == s.length()) {
                    break;
                } else {
                    s = ns;
                }
            }
            System.out.println(s.length() == 0 ? "YES" : "NO");
        }
    }
}
