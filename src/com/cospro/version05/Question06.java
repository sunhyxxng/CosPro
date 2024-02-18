package com.cospro.version05;

public class Question06 {
    private String convertFormation(String s1, String s2, int p, int q) {
        int tempS1 = Integer.parseInt(s1, p);
        int tempS2 = Integer.parseInt(s2, p);
        return Integer.toString(tempS1 + tempS2, q);
    }

    public static void main(String[] args) {
        Question06 sol = new Question06();
        String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
        System.out.println(sol.convertFormation(s1, s2, p, q));
    }
}
