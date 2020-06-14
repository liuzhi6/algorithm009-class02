package com.company.fourWeek.operation;

/**
 * 买卖股票的最佳时机 II - 贪心算法
 */
public class MaxProfit20200613 {

    public static void main(String[] args) {
        MaxProfit20200613 m = new MaxProfit20200613();
        System.out.println(m.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int [] prices){
        int profit = 0;
        for (int i = 1; i < prices.length;i++){
            int tmp = prices[i] - prices[i - 1];
            if(tmp > 0) profit +=tmp;
        }
        return profit;
    }


}
