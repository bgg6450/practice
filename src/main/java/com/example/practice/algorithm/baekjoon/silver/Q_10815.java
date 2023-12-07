package com.example.practice.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(s1[i]);
        }
        int m = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(s2[i]);
        }
        Arrays.sort(arr2);
        String[] result = new String[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (judge(arr1[j], arr2)) {
                    result[i] = "1";
                    break;
                }
                result[i] = "0";
            }
        }
        Arrays.stream(result).forEach(System.out::println);
    }

    static boolean judge(int num, int[] arr) {
        int size = arr.length;
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < num) {
                low = mid + 1;
            }
            else if (arr[mid] > num) {
                high = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
