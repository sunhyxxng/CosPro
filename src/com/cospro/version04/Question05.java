package com.cospro.version04;

public class Question05 {
    public String reverse(String number) {
        String reverseNumber = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverseNumber += number.charAt(i);
        }
        return reverseNumber;
    }

    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += Integer.toString(i + 1);
            answer = reverse(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Question05 sol = new Question05();
        int n = 5;
        System.out.println(sol.solution(n));
    }
}
