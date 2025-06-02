class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for ( int i =0 ; i<prices.length;i++)
        {
            int price  = prices[i]-min;
            min = Math.min(min , prices[i]);
            profit = Math.max(profit , price);

        }
        return profit ;
        
    }
}