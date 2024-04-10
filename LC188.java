class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] dp = new int[2*k+1];
        for(int i = 1; i < 2*k + 1; i+= 2){
            dp[i] = -prices[0];
        }
        for(int i = 1; i < prices.length; i++){
            for(int j = 0; j < 2 * k; j += 2){
                dp[j + 1] = Math.max(dp[j + 1], dp[j] - prices[i]);
                dp[j + 2] = Math.max(dp[j + 2], dp[j + 1] + prices[i]);
            }
        }
        return dp[2*k];
    }   
}
//O(NK), O(K)
