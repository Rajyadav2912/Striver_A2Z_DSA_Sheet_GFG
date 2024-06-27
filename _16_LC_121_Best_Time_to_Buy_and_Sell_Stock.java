public class _16_LC_121_Best_Time_to_Buy_and_Sell_Stock {
    public static int Buy_Sell_Stock(int prices[]) {
        int Buy_Price = Integer.MAX_VALUE;

        int MAX = 0;

        for (int i = 0; i < prices.length; i++) {
            if (Buy_Price < prices[i]) {
                int Profit = prices[i] - Buy_Price;

                MAX = Math.max(MAX, Profit);
            } else {
                Buy_Price = prices[i];
            }
        }
        return MAX;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Buy_Sell_Stock(prices));
    }
}