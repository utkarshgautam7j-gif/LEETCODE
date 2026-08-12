class Solution {
    public int search(int[] nums, int tgt) {
        int n= nums.length-1;
        int st =0;
        int end = n;
        //int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (nums[mid]==tgt) return mid;
            if(nums[mid]>=nums[st]){
                if(nums[st]<=tgt && nums[mid]>tgt){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(nums[mid]<tgt && nums[end]>=tgt){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}