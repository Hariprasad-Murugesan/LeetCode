package Dsa.leetcode;

class SellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int priceDifference = prices[i] - prices[i - 1];
            if (priceDifference > 0) {
                maxProfit += priceDifference;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        SellStock2 sol = new SellStock2();
        int [] prices = {7,1,5,3,6,4};
        int res = sol.maxProfit(prices);
        System.out.println(res);
    }
}