class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                st = mid + 1;
            }
            else {
                if (mid == 0 || nums[mid] != nums[mid - 1]) {
                    ans[0] = mid;
                    break;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        st = 0;
        end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                st = mid + 1;
            }
            else {
                if (mid == nums.length - 1 || nums[mid] != nums[mid + 1]) {
                    ans[1] = mid;
                    break;
                }
                else {
                    st = mid + 1;
                }
            }
        }

        return ans;
    }
}


/*
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int j=nums.length-1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        for(;j>=0;j--){
            if(nums[j]==target){
                arr[1]=j;
                break;
            }
        }
        return new int[]{arr[0],arr[1]};

    }
}
*/