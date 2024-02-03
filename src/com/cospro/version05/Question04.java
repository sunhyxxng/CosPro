package com.cospro.version05;

public class Question04 {
    private String getNumberAndCount(int number) {
        String answer = "";
        int[] numberCount = new int[10];
        while (number > 0) {
            numberCount[number % 10]++;
            number /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            if (0 != numberCount[i]) {
                answer += (String.valueOf(i) + String.valueOf(numberCount[i]));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question04 sol = new Question04();
        int number1 = 2433;
        String result1 = sol.getNumberAndCount(number1);
        System.out.println(result1);

        int number2 = 662244;
        String result2 = sol.getNumberAndCount(number2);
        System.out.println(result2);
    }
}
