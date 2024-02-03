package com.cospro.version05;

public class Question01 {
    public int getWaysToClimbStairs(int n) {
        int answer = 0;

        int[] steps = new int[n + 1];
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 4;
        for (int i = 4; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2] + steps[i - 3];
        }
        answer = steps[n];
        return answer;
    }

    public static void main(String[] args) {
        Question01 sol = new Question01();
        int n1 = 3;
        int result1 = sol.getWaysToClimbStairs(n1);
        System.out.println(result1);

        int n2 = 4;
        int result2 = sol.getWaysToClimbStairs(n2);
        System.out.println(result2);
    }
}
