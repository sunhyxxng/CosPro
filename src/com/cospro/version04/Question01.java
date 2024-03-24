package com.cospro.version04;

import java.util.ArrayList;

public class Question01 {
    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> words;

    public void createWords(int level, String string) {
        words.add(string);
        for (int i = 0; i < 5; i++) {
            if (level < 5) {
                createWords(level + 1, string.concat(vowels[i]));
            }
        }
    }

    public int findNthWord(String word) {
        int answer = 0;
        words = new ArrayList<String>();
        createWords(0, "");
        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question01 sol = new Question01();
        String word1 = new String("AAAAE");
        System.out.println(sol.findNthWord(word1));

        String word2 = new String("AAAE");
        System.out.println(sol.findNthWord(word2));
    }
}
