package com.example.practice.algorithm.baekjoon.silver;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * 쿼드트리. 정답률 62%
 */
public class Q1992 {

    public static int[][] img;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        // 런타임 시 값을 입력 받음
        Scanner in = new Scanner(System.in);
        // 거기서 꺼낸 값
        int N = in.nextInt();
        img = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = in.next();
            for (int j = 0; j < N; j++) {
                // 스킬인데 문자열을 정수로 변환하는 과정에서 문자열 0이 숫자 48을 빼는 것과 동일한 효과를 나타냄
                img[i][j] = str.charAt(j) - '0';
            }
        }
        QuadTree(0, 0, N);
        out.println(sb);
    }

    public static void QuadTree(int x, int y, int size) {

        // 압축이 가능할 경우 하나의 색상으로 압축해준다.
        if(isPossible(x, y, size)) {
            sb.append(img[x][y]);
            return;
        }

        int newSize = size / 2;	// 압축이 불가능 할 경우 사이즈를 절반으로 나누어야 한다.

        sb.append('(');	// 각 레벨(depth)에서 여는괄호로 시작해야한다.
        QuadTree(x, y, newSize);						// 왼쪽 위
        QuadTree(x, y + newSize, newSize);				// 오른쪽 위
        QuadTree(x + newSize, y, newSize);				// 왼쪽 아래
        QuadTree(x + newSize, y + newSize, newSize);	// 오른쪽 아래

        sb.append(')');	// 해당 레벨이 끝나면 닫는괄호도 닫아준다.

    }


    // 압축이 가능한지 해당 공간을 체크해주는 함수
    public static boolean isPossible(int x, int y, int size) {
        int value = img[x][y];
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(value != img[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
