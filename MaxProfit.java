package Dsa.leetcode;

public class    MaxProfit {
    public int maxProfit(int[] prices) {
        // Initialize variables
        int minPrice = Integer.MAX_VALUE; // Initialize with a very large value
        int maxProfit = 0; // Initialize profit as zero

        // Iterate through the array of prices
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate potential profit if sold at the current price
            int potentialProfit = price - minPrice;

            // Update the maximum profit if the potential profit is higher
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }

        // Return the maximum profit
        return maxProfit;

    }

    public static void main(String[] args) {
        MaxProfit sol = new MaxProfit();
        int [] prices = {7,6,4,3,1};
        int res = sol.maxProfit(prices);
        System.out.println(res);

    }
}