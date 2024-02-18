package com.cospro.version05;

public class Question08 {
    private int getCommonFactor(int a, int b) {
        int mod = a % b;
        while (mod > 0) {
            a = b;
            b = mod;
            mod = a % b;
        }
        return b;
    }

    private int getCountOfCommonFactor(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (checkNoMoreFactor(n, i)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean checkNoMoreFactor(int p, int q) {
        if (0 == p % q) {
            return true;
        } else {
            return false;
        }
    }

    private int getCountOfGreatestOfCommonFactor(int a, int b, int c) {
        int answer = 0;
        int gcd = getCommonFactor(getCommonFactor(a, b), c);
        answer = getCountOfCommonFactor(gcd);
        return answer;
    }

    public static void main(String[] args) {
        Question08 sol = new Question08();
        int a = 24;
        int b = 9;
        int c = 15;
        System.out.println(sol.getCountOfGreatestOfCommonFactor(a, b, c));
    }
}
