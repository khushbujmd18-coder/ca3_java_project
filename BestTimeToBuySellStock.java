
class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

public class BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        Solution obj = new Solution();

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
