package com.cospro.version05;

public class Question02 {
    private int getMaxFillWater(int[][] walls) {
        int answer = 0;
        for (int i = 0; i < walls.length; i++) {
            for (int j = i + 1; j < walls.length; j++) {
                int area = 0;
                if (walls[i][1] > walls[j][1]) {
                    area = walls[j][1] * (walls[j][0] - walls[i][0]);
                } else {
                    area = walls[j][1] * (walls[j][0] - walls[i][0]);
                }
                if (answer < area) {
                    answer = area;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question02 sol = new Question02();
        int[][] walls = {{1, 4}, {2, 6}, {3, 5}, {5, 3}, {6, 2}};
        int result = sol.getMaxFillWater(walls);
        System.out.println(result);
    }
}
