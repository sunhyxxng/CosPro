package com.cospro.version04;

public class Question03 {
    public long getMinimumCost(int oneDayPrice, int multipleDay, int multipleDayPrice, long n) {
        if (oneDayPrice * multipleDay <= multipleDayPrice) {
            return n * oneDayPrice;
        } else {
            return (n % multipleDay) * oneDayPrice + (n / multipleDay) * multipleDayPrice;
        }
    }

    public static void main(String[] args) {
        Question03 sol = new Question03();

        int[] oneDayPriceList = {3, 2};
        int[] multipleDayList = {5, 3};
        int[] multipleDayPriceList = {14, 5};
        long[] nList = {6, 11};

        for (int i = 0; i < 2; i++) {
            System.out.println("각 스키장 최소 비용은 " +
                    sol.getMinimumCost(oneDayPriceList[i], multipleDayList[i], multipleDayPriceList[i], nList[i]));
        }
    }
}
