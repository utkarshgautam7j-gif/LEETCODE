class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int st =1;
        int end = 1000000;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int mid=st+(end-st)/2;
            long sum =0;
            for(int i=0;i<nums.length;i++){
                sum=sum+(nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                ans = mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;

    }
}