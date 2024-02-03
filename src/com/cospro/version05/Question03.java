package com.cospro.version05;

import java.util.Arrays;

public class Question03 {
    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private int[] sortByDictionary(int[] numbers) {
        int[] answer = {};

        Arrays.sort(numbers);
        int middle = (numbers.length - 1) / 2;
        swap(numbers, middle, numbers.length - 1);

        int left = middle + 1;
        int right = numbers.length - 2; // 앞에서 마지막 수 swap 했기 때문
        while (left <= right) {
            swap(numbers, left, right);
            left += 1;
            right -= 1;
        }
        answer = numbers;
        return answer;
    }

    public static void main(String[] args) {
        Question03 sol = new Question03();
        int[] numbers = {7, 3, 4, 1, 2, 5, 6};
        int[] result = sol.sortByDictionary(numbers);
        System.out.println(Arrays.toString(result));
    }
}
