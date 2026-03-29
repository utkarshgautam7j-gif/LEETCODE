import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 2*n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % n]) {
                stack.pop();
            }

            if (i < n) {
                if (!stack.isEmpty()) {
                    res[i] = nums[stack.peek()];
                }
            }

            stack.push(i % n);
        }

        return res;
    }
}