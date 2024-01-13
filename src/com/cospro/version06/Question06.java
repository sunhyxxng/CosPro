package com.cospro.version06;

public class Question06 {
    public int getMaxSum(int[][] grid) {
        int maxSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k += 2) {
                    maxSum = Math.max(maxSum, Math.max(grid[i][j] + grid[i][k], grid[i][j] + grid[k][j]));
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Question06 solution = new Question06();
        int[][] grid = {{1, 4, 16, 1}, {20, 5, 15, 8}, {6, 13, 36, 14}, {20, 7, 19, 15}};
        int result = solution.getMaxSum(grid);
        System.out.println(result);
    }
}
