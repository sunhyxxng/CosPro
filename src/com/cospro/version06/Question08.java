package com.cospro.version06;

public class Question08 {
    final int INCREASE = 0;
    final int DECREASE = 1;

    private int[] makeZigZag(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        result[0] = 1;
        for (int i = 1; i < length; i++) {
            if (array[i] != array[i - 1]) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = 2;
            }
        }
        return result;
    }

    private int[] checkIncreaseOrDecrease(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        result[0] = -1;
        for (int i = 1; i < length; i++) {
            if (array[i] > array[i - 1]) {
                result[i] = INCREASE;
            } else if (array[i] < array[i - 1]) {
                result[i] = DECREASE;
            }
        }
        return result;
    }

    private int findMaxNumber(int[] array) {
        int length = array.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        if (2 == result) {
            return 0;
        }
        return result;
    }

    private int solution(int[] S) {
        int[] check = checkIncreaseOrDecrease(S);
        int[] dp = makeZigZag(check);
        int answer = findMaxNumber(dp);
        return answer;
    }

    public static void main(String[] args) {
        Question08 sol = new Question08();
        int[] S1 = {2, 5, 7, 3, 4, 6, 1, 8, 9};
        int result1 = sol.solution(S1);
        System.out.println(result1);

        int[] S2 = {4, 3, 2, 1, 10, 6, 9, 7, 8};
        int result2 = sol.solution(S2);
        System.out.println(result2);

        int[] S3 = {1, 2, 3, 4, 5};
        int result3 = sol.solution(S3);
        System.out.println(result3);
    }
}
