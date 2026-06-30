class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=((n)*(n+1))/2;
        int pseudo_sum=0;
        for(int i:nums){
            pseudo_sum+=i;
        }
        int ans=sum-pseudo_sum;
        return ans;
    }
}

/*
import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int  n:nums){
            if(ans!=n){
                return ans;
            }
            ans++;
        }
        return ans++;
    }
}
*/