/*
import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        int []  arr = new int [nums.length];
        int j =0 ;
        int r=k;
        if  (nums.length < k){
            r=k % nums.length;
        }
        for  (int i = r-1; i>=0 ; i--){
            arr[i]=nums[nums.length-1-j];
            j++;
        }

        for  (int i = 0 ;i<nums.length-r ; i++){
            arr[r+i] = nums[i];
        }
        for (int i =0 ; i<nums.length ; i++){
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
        
    }
}
*/

class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // handle large k

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++;
            j--;
        }
    }
}
