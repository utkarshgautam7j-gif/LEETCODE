

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //boolean ans=  false;
        l:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i>k){
                    continue l;
                }
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}