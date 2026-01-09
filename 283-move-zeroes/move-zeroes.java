class Solution {
    public void moveZeroes(int[] nums) {

        
        int x = nums.length ;
        // int [] arr = new int [x];
        int k = 0;
        for (int i : nums){
            if (i != 0){
                nums [k] = i;
                k++;
            }

        }
        while (k<nums.length){
            nums[k] = 0;
            k++;
        }
        System.out.println(Arrays.toString(nums));
        
    }
}

