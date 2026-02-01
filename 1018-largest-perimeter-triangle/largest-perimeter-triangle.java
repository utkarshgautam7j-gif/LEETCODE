import java.util.Arrays;
class Solution {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int sum=0;
        for(int i=n-1;i>=2;i--){
            if((arr[i-1]+arr[i-2])>arr[i]){
                sum=arr[i-1]+arr[i-2]+arr[i];
                break;
            }
        }
        return sum;
    }
}