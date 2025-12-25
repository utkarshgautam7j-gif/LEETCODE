/*
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       return trim(nums,k);
    }
    private static int max(int []arr,int k){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    private static int[] trim(int[] nums,int k){
        int  new_arr_len=nums.length-k+1;
        int [] ans = new int[new_arr_len];
        int [] trimmed=new int[k];
        for(int i=0;i<nums.length-k+1;i++){
            for(int j=0;j<k;j++){
                trimmed[j]=nums[i+j];
            }
            ans[i]=max(trimmed,k);
        }
        return ans;
    }

}
*/
// IN my both approach TLE so i used gpt for this [learn about this approach and dominate this that's it]
/*
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }
}
*/
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // 1️⃣ Remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2️⃣ Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3️⃣ Add current index
            dq.offerLast(i);

            // 4️⃣ Save answer
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
