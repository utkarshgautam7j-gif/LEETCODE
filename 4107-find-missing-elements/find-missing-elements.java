import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);

        int min = nums[0] + 1;
        int max = nums[n - 1];

        int i = 1;

        while (min < max) {

            if (i < n && min == nums[i]) {
                i++;
            } else {
                ans.add(min);
            }

            min++;
        }

        return ans;
    }
}