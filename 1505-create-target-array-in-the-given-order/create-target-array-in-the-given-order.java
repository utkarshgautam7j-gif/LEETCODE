class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (index[i]>i){
                ans[index[i]] = nums[i];
            } else {
                int prev = ans[index[i]];
                ans[index[i]] = nums[i];

                for (int j = index[i] + 1; j < n; j++) {
                    int temp = ans[j];
                    ans[j] = prev;
                    prev = temp;
                }
            }
        }
        return ans;
    }
}
