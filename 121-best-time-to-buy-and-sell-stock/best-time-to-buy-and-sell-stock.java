class Solution {
    public int maxProfit(int[] prices) {
        int buy =Integer.MAX_VALUE;
        int sell=Integer.MIN_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                sell=prices[i];
                if(sell-buy>profit){
                    profit=sell-buy;
                }
            }
        }
        return profit;
    }
}