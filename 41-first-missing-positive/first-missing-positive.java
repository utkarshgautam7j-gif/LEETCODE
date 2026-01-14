import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int lessThanOne = 0;
        for (int v : nums) {
            if (v < 1) lessThanOne++;
            else break; 
        }

        int new_len = n - lessThanOne;
        if (new_len == 0) return 1;    
             
        int[] new_arr = new int[new_len];
        for (int i = 0; i < new_len; i++) new_arr[i] = i + 1;

        int i = lessThanOne; 
        int j = 0;          
        while (i < n && j < new_len) {
            if (nums[i] == new_arr[j]) {
                int val = nums[i];
                while (i < n && nums[i] == val) i++;
                j++;
            } else if (nums[i] < new_arr[j]) {
                
                int val = nums[i];
                while (i < n && nums[i] == val) i++;
            } else { 
                return new_arr[j]; 
            }
        }

        if (j < new_len) return new_arr[j];

        return new_len + 1;
    }
}
