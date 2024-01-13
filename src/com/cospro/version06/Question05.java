package com.cospro.version06;

public class Question05 {
    public int getMaxCoins(int[][] board) {
        int answer = 0;

        int[][] coins = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (0 == i && 0 == j) {
                    coins[i][j] = board[i][j];
                } else if (0 == i && 0 != j) {
                    coins[i][j] = board[i][j] + coins[i][j-1];
                } else if (0 != i && 0 == j) {
                    coins[i][j] = board[i][j] + coins[i-1][j];
                } else {
                    coins[i][j] = board[i][j] + Math.max(coins[i-1][j], coins[i][j-1]);
                }
            }
        }
        answer = coins[3][3];
        return answer;
    }

    public static void main(String[] args) {
        Question05 solution = new Question05();
        int[][] board = {{6, 7, 1, 2}, {3, 5, 3, 9}, {6, 4, 5, 2}, {7, 3, 2, 6}};
        int result = solution.getMaxCoins(board);
        System.out.println(result);
    }
}
