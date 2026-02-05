class Solution {
    public int differenceOfSum(int[] nums) {
        int e_sum=0;
        int d_sum =0;
        for (int i=0;i<nums.length;i++){
            e_sum = e_sum+nums[i];
            d_sum = d_sum+dig_sum(nums[i]);

        }
        return Math.abs(e_sum-d_sum);

        
    }
    private static int dig_sum(int n){
        int sum =0;
        while(n>0){
            sum =sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}