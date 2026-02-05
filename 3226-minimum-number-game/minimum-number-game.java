class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int [] arr=new int [nums.length];
        for(int i=0;i<nums.length;){
            arr[i]=nums[i+1];
            i=i+2;
        }
        for(int i=1;i<nums.length;){
            arr[i]=nums[i-1];
            i=i+2;
        }
        return arr;
    }
}