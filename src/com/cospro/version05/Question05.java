package com.cospro.version05;

public class Question05 {
    private int getMaxCountOfMonsters(int[] enemies, int[] armies) {
        int answer = 0;
        for (int army : armies) {
            int tempCount = 0;
            for (int enemy : enemies) {
                if (army >= enemy) tempCount++;
            }
            answer = Math.max(answer, tempCount);
        }
        return answer;
    }

    public static void main(String[] args) {
        Question05 sol = new Question05();
        int[] enemies1 = {1, 4, 3};
        int[] armies1 = {1, 3};
        System.out.println(sol.getMaxCountOfMonsters(enemies1, armies1));

        int[] enemies2 = {1, 1, 1};
        int[] armies2 = {1, 2, 3, 4};
        System.out.println(sol.getMaxCountOfMonsters(enemies2, armies2));
    }
}
