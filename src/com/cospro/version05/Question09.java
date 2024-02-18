package com.cospro.version05;

public class Question09 {
    private int getCountIfDouble(int number, int target, boolean plus) {    // target이 number의 2배 이상
        int count = 0;
        int divide = target / number;
        while (divide >= 2) {
            if (0 == target % 2) {  // 짝수
                target /= 2;
            } else {    // 홀수
                if (plus) {
                    target += 1; // 짝수로
                } else {
                    target -= 1; // 짝수
                }
            }
            count++;
            divide = target / number;
        }
        count += getCountIfOneLess(divide, number, target);
        return count;
    }

    private int getCountIfOneLess(int divide, int number, int target) { // target이 number의 1배 이하
        int count = 0;
        if (1 == divide) {
            count = Math.min(number * 2 - target + 1, target - number);
        } else {
            count = Math.abs(number - target);
        }
        return count;
    }

    private int solution(int number, int target) {
        int answer = 0;
        int divide = target / number;
        if (divide > 2) {
            answer = Math.min(getCountIfDouble(number, target, true),
                    getCountIfDouble(number, target, false));
        } else {
            answer = getCountIfOneLess(divide, number, target);
        }
        return answer;
    }

    public static void main(String[] args) {
        Question09 sol = new Question09();
        int number1 = 5;
        int target1 = 9;
        System.out.println(sol.solution(number1, target1));

        int number2 = 3;
        int target2 = 11;
        System.out.println(sol.solution(number2, target2));
    }
}
