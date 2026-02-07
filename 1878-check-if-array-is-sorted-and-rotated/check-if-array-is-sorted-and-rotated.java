class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int idx = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                idx = i + 1;
                break;
            }
        }

        rotate(nums, 0, idx - 1);
        rotate(nums, idx, n - 1);
        rotate(nums, 0, n - 1);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


/*
class Solution {
    public boolean check(int[] nums) {
        int idx=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
            if(count>1) return false;
        }
        return true;
    }
}
*/
