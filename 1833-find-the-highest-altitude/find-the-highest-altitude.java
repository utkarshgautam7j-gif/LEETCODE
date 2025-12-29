class Solution {
    public int largestAltitude(int[] gain) {
        int high =0;
        int current_peak=0;
        for(int i=0;i<gain.length;i++){
            current_peak=current_peak+gain[i];
            high=Math.max(high,current_peak);
        }
        return high;
    }
}