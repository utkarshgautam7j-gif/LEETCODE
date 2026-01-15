class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max){
                ans=i-1;
                return ans;
            }
            else{
                max=nums[i];
            }
        }

        return nums.length-1;
    }
}