package com.cospro.version04.question04;

import java.util.ArrayList;
import java.util.Arrays;

public class Question04 {
    public static final int n = 4;

    public ArrayList<Integer> getEmptyItem(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean[] exist = new boolean[n * n + 1];
        Arrays.fill(exist, false);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                exist[matrix[i][j]] = true;
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (false == exist[i]) {
                result.add(i);
            }
        }
        return result;
    }

    public ArrayList<Pair<Integer, Integer>> getEmptyCoords(int[][] matrix) {
        ArrayList<Pair<Integer, Integer>> result = new ArrayList<Pair<Integer, Integer>>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (0 == matrix[i][j]) {
                    result.add(new Pair<Integer, Integer>(i, j));
                }
            }
        }
        return result;
    }

    public boolean isMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i <= n * n; i++) {
            sum += i;
        }
        sum = sum / n;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            if (rowSum != sum || colSum != sum)
                return false;
        }
        int mainDiagonalSum = 0;
        int skewDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            skewDiagonalSum += matrix[i][n - 1 - i];
        }
        if (mainDiagonalSum != sum || skewDiagonalSum != sum) {
            return false;
        }
        return true;
    }

    public int[] solution(int[][] matrix) {
        int[] answer = new int[6];
        int answerIndex = 0;
        ArrayList<Pair<Integer, Integer>> coords = getEmptyCoords(matrix);
        ArrayList<Integer> nums = getEmptyItem(matrix);

        matrix[coords.get(0).key][coords.get(0).value] = nums.get(0);
        matrix[coords.get(1).key][coords.get(1).value] = nums.get(1);

        if (isMatrix(matrix)) {
            for (int i = 0; i <= 1; i++) {
                answer[answerIndex++] = coords.get(i).key + 1;
                answer[answerIndex++] = coords.get(i).value + 1;
                answer[answerIndex++] = nums.get(i);
            }
        } else {
            matrix[coords.get(0).key][coords.get(0).value] = nums.get(1);
            matrix[coords.get(1).key][coords.get(1).value] = nums.get(0);
            for (int i = 0; i <= 1; i++) {
                answer[answerIndex++] = coords.get(1 - i).key + 1;
                answer[answerIndex++] = coords.get(1 - i).value + 1;
                answer[answerIndex++] = nums.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question04 sol = new Question04();
        int[][] matrix = {{16, 2, 3, 13}, {5, 11, 10, 0}, {9, 7, 6, 12}, {0, 14, 15, 1}};
        System.out.println(Arrays.toString(sol.solution(matrix)));
    }
}
