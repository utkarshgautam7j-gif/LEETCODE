class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i=start;
        int j=start;
        int len = nums.length;
        int ans =0;
        while(i<len || j>=0){
            if(nums[i]==target){
                ans=Math.abs(i-start);
                break;
            }
            else if(nums[j]==target){
                ans= Math.abs(j-start);
                break;
            }
            if(i!=len-1) i++;
            if(j!=0) j--;
        }
        return ans ;
    }
}