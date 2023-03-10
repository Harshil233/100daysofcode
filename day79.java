class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
            min = prices[i];
            if(prices[i]-min>0){
            profit = profit + prices[i] - min;
            min = prices[i];
            }
        }
        return profit;
    }
}
