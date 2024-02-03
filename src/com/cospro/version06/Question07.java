package com.cospro.version06;

public class Question07 {
    public int findPossilbeNumbers(int K, int[] numbers, String[] UpDown) {
        int left = 1;
        int right = K;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if ("UP".equals(UpDown[i])) {
                left = Math.max(left, number);
            } else if ("DOWN".equals(UpDown[i])) {
                right = Math.min(right, number);
            } else if ("RIGHT".equals(UpDown[i])) {
                return 1;
            }
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Question07 solution = new Question07();
        int K1 = 10;
        int[] numbers1 = {4, 9, 6};
        String[] UpDown1 = {"UP", "DOWN", "UP"};
        int result1 = solution.findPossilbeNumbers(K1, numbers1, UpDown1);
        System.out.println(result1);

        int K2 = 10;
        int[] numbers2 = {2, 1, 6};
        String[] UpDown2 = {"UP", "UP", "DOWN"};
        int result2 = solution.findPossilbeNumbers(K2, numbers2, UpDown2);
        System.out.println(result2);

        int K3 = 100;
        int[] numbers3 = {97, 98};
        String[] UpDown3 = {"UP", "RIGHT"};
        int result3 = solution.findPossilbeNumbers(K3, numbers3, UpDown3);
        System.out.println(result3);
    }
}
