package week1;

public class W1E4 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        int profit = 0;

        for (int price : prices) {

            if (price < lowestPrice) {
                lowestPrice = price;
                continue;
            }

            profit = price - lowestPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}
