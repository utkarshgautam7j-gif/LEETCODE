class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=(sum+arr[i]);
        }
        int j=0;
        int max=sum;
        for(int i=k;i<n;i++){
            sum=(sum-arr[j]+arr[i]);
            max=Math.max(sum,max);
            j++;
        }
        return (double)max/k;

    }
}