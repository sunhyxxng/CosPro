package com.cospro.version06;

public class Question02 {
    public int getLineNumbers(int K, String[] words) {
        int lineNumbers = 1;
        int currentWordsLength = 0;
        for (int i = 0; i < words.length; i++) {
            currentWordsLength += words[i].length() + 1;
            if (currentWordsLength > K + 1) {
                lineNumbers++;
                currentWordsLength = 0;
                currentWordsLength += words[i].length() + 1;
            }
        }
        return lineNumbers;
    }

    public static void main(String[] args) {
        Question02 solution = new Question02();
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        int result = solution.getLineNumbers(K, words);
        System.out.println("총 라인 수는 " + result);
    }
}
