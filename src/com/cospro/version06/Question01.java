package com.cospro.version06;

import java.util.LinkedList;
import java.util.Queue;

public class Question01 {
    public static int xMove[] = {-1, 1, 0, 0};
    public static int yMove[] = {0, 0, -1, 1};

    class Info {
        int x;
        int y;
        Info(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int getBloomingDays(int n, int[][] garden) {
        int bloomingDays = 0;
        boolean isAllBlooming = false;
        Queue<Info> bloomingFlowers = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (1 == garden[i][j]) {
                    bloomingFlowers.add(new Info(i, j));
                }
            }
        }

        while (!bloomingFlowers.isEmpty()) {
            Info flowerInfo = bloomingFlowers.poll();
            int x = flowerInfo.x;
            int y = flowerInfo.y;
            for (int i = 0; i < 4; i++) {
                int xTo = x - xMove[i];
                int yTo = y - yMove[i];
                if (xTo < 0 || yTo < 0 || xTo >= n || yTo >= n) continue;
                if (0 == garden[xTo][yTo]) {
                    bloomingDays = Math.max(bloomingDays, garden[x][y]);
                    garden[xTo][yTo] = garden[x][y] + 1;
                    bloomingFlowers.add(new Info(xTo, yTo));
                }
            }
        }
        return bloomingDays;
    }

    public static void main(String[] args) {
        Question01 sol = new Question01();
        int n1 = 3;
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.getBloomingDays(n1, garden1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.getBloomingDays(n2, garden2);

        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
