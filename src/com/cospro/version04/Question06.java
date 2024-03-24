package com.cospro.version04;

import java.util.Arrays;

public class Question06 {
    public int power(int base, int exponent) {
        int value = 1;
        for (int i = 0; i < exponent; i++) {
            value *= base;
        }
        return value;
    }

    public int[] solution(int k) {
        int range = power(10, k);
        int[] answer = new int[range];
        int count = 0;
        for (int i = range / 10; i < range; i++) {
            int current = i;
            int calculated = 0;
            while (0 != current) {
                calculated += power(current % 10, k);
                current /= 10;
            }
            if (i == calculated) {
                answer[count++] = i;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = answer[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Question06 sol = new Question06();
        int k = 3;
        System.out.println(Arrays.toString(sol.solution(k)));
    }
}
