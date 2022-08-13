package easy.best_time_to_sell_stock;
/*
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

public class Solution {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = (prices[r] - prices[l]);
                maxProfit = Math.max(profit, maxProfit);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
}
