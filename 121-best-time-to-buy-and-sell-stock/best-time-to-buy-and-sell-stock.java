/*
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i = 0 ; i < prices.length ; i++){
            for(int j=i+1 ; j< prices.length ; j++){
                if (-1 * (prices[i] - prices[j]) >= max ){
                    max = (-1 * (prices[i] - prices[j]));
                }
            }
        }
        return max ;       
    }
}

//   code is perfect but time complexity is O(n2) so not working for big array


*/

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max=0;
        for(int i=1; i<prices.length; i++){
            
            if(prices[i]<min){
                min=prices[i];
            } else{
                if (prices[i] - min > max) {
                    max = prices[i] - min;
                }
            }
        }
        return max;
        
    }
}


