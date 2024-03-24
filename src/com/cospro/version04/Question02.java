package com.cospro.version04;

import com.cospro.version05.Question10;

public class Question02 {
    public String compressWord(String s) {
        s = s.toLowerCase();
        String answer = "";
        char previous = s.charAt(0);
        int counter = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previous) {
                counter++;
            } else {
                answer += previous;
                answer += counter;
                counter = 1;
                previous = s.charAt(i);
            }
        }
        answer += previous;
        answer += counter;
        return answer;
    }

    public static void main(String[] args) {
        Question02 sol = new Question02();
        String s = new String("YYYYYbbbBbbBBBMmmM");
        System.out.println(sol.compressWord(s));
    }
}
