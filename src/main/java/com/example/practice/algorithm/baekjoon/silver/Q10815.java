package com.example.practice.algorithm.baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = Integer.parseInt(st1.nextToken());
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if (judge(num, arr1)) {
                bw.write("1 ");
            }
            else bw.write("0 ");
        }
        bw.close();
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
