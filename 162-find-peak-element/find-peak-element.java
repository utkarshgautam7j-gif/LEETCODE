class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int ans=nums.length-1;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            else{
                ans=i-1;
                return ans;
            }
        }
        return ans;
    }
}


/*
class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int ans=nums.length-1;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            else{
                ans=i-1;
            }
        }
        return ans;
    }
}
*/