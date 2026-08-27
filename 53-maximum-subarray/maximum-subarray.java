class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        if(nums.length==1) return sum;
        int max =nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(sum<0 && nums[i]>=sum){
                sum=nums[i];
            }
            else{
                sum=sum+nums[i];
            }
            max= Math.max(max,sum);

        }
        return max;
    }
}