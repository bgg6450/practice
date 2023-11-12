package com.example.practice.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.*;

/**
 * 브론즈2
 * 백설 공주와 일곱 난쟁이. 정답률 69%
 */
public class Q_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        int[] nums = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int e = Integer.parseInt(bf.readLine());
            nums[i] = e;
            sum += e;
        }
        outerLoop:
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (nums[i] + nums[j] == sum - 100) {
                    nums[i] = 0;
                    nums[j] = 0;
                    break outerLoop;
                }
            }
        }
        Arrays.stream(nums).filter(n -> n != 0).forEach(out::println);
    }
}
