class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg=sum/k;
        if(avg >= threshold) c++;

        int j=0;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[j];
            j++;
            if((sum/k)>=threshold)c++;
        }
        return c;

    }
}