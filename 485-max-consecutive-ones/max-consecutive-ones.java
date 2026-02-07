class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                c=Math.max(temp,c);
                temp=0;
            }
            else{
                temp++;
            }
        }
        return Math.max(c,temp);
    }
}