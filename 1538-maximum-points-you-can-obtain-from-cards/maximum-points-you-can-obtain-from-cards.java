class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum=0;
        int n = cardPoints.length;
        for(int i=0;i<n;i++){
            total_sum+=cardPoints[i];
        }
        if(k==n) return total_sum;

        int rem_window = n-k;
        int sum=0;
        for(int i=0;i<rem_window;i++){
            sum+=cardPoints[i];
        }
        int min =sum;
        for(int i=rem_window;i<n;i++){
            sum=sum+cardPoints[i]-cardPoints[i-rem_window];
            min=Math.min(min,sum);
        }
        return total_sum - min;
    }
}