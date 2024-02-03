package com.cospro.version06;

import java.util.Arrays;

public class Question03 {
    public int getDifference(int[] numberArray, int K) {
        int difference = 999999;
        Arrays.sort(numberArray);
        for (int i = 0; i < numberArray.length - K + 1; i++) {
            difference = Math.min(difference, numberArray[K+i-1] - numberArray[i]);
        }
        return difference;
    }

    public static void main(String[] args) {
        Question03 solution = new Question03();
        int[] numberArray = {9, 11, 9, 6, 4, 19};
        int K = 4;
        int result = solution.getDifference(numberArray, K);
        System.out.println(result);
    }
}
