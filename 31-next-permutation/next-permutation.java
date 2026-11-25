class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int piv =-1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                piv =i-1;
                break;
            }
        }

        if(piv==-1){
            Arrays.sort(nums);
            System.out.println(nums.toString());
            return;
        }
        int s=0;
        for(int j=n-1;j>piv;j--){
            if(nums[j]>nums[piv]){
                s=j;
                break;
            }
        }
        int temp = nums[s];
        nums[s]=nums[piv];
        nums[piv]=temp;

        Arrays.sort(nums,piv+1,n);

        System.out.println(nums.toString());
    }
}