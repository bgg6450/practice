package com.example.practice.algorithm.baekjoon.silver;

import java.io.*;
import java.util.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st1.nextToken());

        Arrays.sort(arr);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) map.merge(i, 1, Integer::sum);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            int num = Integer.parseInt(st2.nextToken());
            bw.write(binarySearch(num, arr, map) + " ");
        }
        bw.close();
    }

    private static int binarySearch(int n, int[] arr, Map<Integer, Integer> map) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > n) {
                high = mid - 1;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else return countNum(arr[mid], map);
        }
        return 0;
    }

    private static int countNum(int n, Map<Integer, Integer> map) {
        return map.get(n);
    }
}
