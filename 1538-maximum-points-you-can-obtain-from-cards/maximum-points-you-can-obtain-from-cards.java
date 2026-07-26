class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int total =0;
        for(int i=0;i<n;i++){
            total=total+cardPoints[i];
        }
         if (k == n)
            return total;
        int window = n-k;
        int sum=0;
        for(int i=0;i<window;i++){
            sum=sum+cardPoints[i];
        }
        int minsum=sum;
        for(int i=window;i<n;i++){
            sum=sum+cardPoints[i]-cardPoints[i-window];
            minsum= Math.min(minsum,sum);
        }
        return total-minsum;
    }
}