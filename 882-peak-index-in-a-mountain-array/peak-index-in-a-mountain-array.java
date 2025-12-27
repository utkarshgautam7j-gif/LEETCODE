class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        int max=0;
        for(int i=1;i<arr.length-1;i++){
            if((arr[0]<arr[i] && arr[i]>arr[arr.length-1]) && arr[i]>max){
                peak=i;
                max=arr[i];
            }
        }
        return peak;
    }
}