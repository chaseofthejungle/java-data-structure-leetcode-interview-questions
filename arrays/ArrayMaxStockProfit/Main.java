public class Main {
    public static int maxStockProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0; // maximum profit that can be earned by buying/selling the stock 1 time

        for (int price: prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {1, 2, 3, 4, 5, 6, 7};
        int profit1 = maxStockProfit(prices1);
        System.out.println("Maximum Stock Profit for Array #1: " + profit1); // 6

        int[] prices2 = {1, 1, 3, 5, 7, 9};
        int profit2 = maxStockProfit(prices2);
        System.out.println("Maximum Stock Profit for Array #2: " + profit2); // 8

        int[] prices3 = {2, 5, 3, 6, 1, 8, 4};
        int profit3 = maxStockProfit(prices3);
        System.out.println("Maximum Stock Profit for Array #3: " + profit3); // 7
    }
}
