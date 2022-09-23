/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/13
 * @Description
 */
public class L_122 {

    //贪心
//    public int maxProfit(int[] prices) {
//        if (prices.length == 1) return 0;
//        int max_profit = 0;
//        for (int i = 1; i < prices.length; i++) {
//            //如果当前还能赚钱，那就继续叠加利益
//            int profit = prices[i] - prices[i - 1];
//            if (profit > 0) {
//                //交易：
//                max_profit += profit;
//            }
//        }
//        return max_profit;
//    }


    //dp
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int[][] dp = new int[prices.length][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}
