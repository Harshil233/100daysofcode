class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int amount = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++)
        {
            if(amount > prices[i])
            {
                amount = prices[i];
            }
            else if (profit < (prices[i] - amount))
            {
                profit = prices[i] - amount;
            }
        }
        return profit;
    }
}
