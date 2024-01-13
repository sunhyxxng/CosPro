package com.cospro.version06;

public class Question04 {
    public int findKthCardNumber(int n, int mix, int k) {
        int cardNumber = 0;

        int[] card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = i + 1;
        }
        while (0 != (mix--)) {
            int[] cardA = new int[n/2];
            int[] cardB = new int[n/2];

            for (int i = 0; i < n; i++) {
                if (i < n/2) {
                    cardA[i] = card[i];
                } else {
                    cardB[i % (n/2)] = card[i];
                }
            }

            for (int i = 0; i < n; i++) {
                if (0 == i % 2) {
                    card[i] = cardA[i/2];
                } else {
                    card[i] = cardB[i/2];
                }
            }
        }
        cardNumber = card[k-1];
        return cardNumber;
    }

    public static void main(String[] args) {
        Question04 solution = new Question04();
        int n = 6;
        int mix = 3;
        int k = 3;
        int result = solution.findKthCardNumber(n, mix, k);
        System.out.println(result);
    }
}
