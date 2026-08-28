class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len =1;
        int n = nums.length;
        int sum=0;
        int j=0;
        int min_len=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            while(sum>=target){
                min_len=Math.min(min_len,i-j+1);
                sum=sum-nums[j];
                j++;
            }

        }
        if(min_len==Integer.MAX_VALUE) return 0;
        return min_len;
    }
}