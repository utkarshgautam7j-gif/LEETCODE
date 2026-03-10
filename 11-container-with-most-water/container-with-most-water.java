class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxarea=0;

        while(left<right){
            int area =0;
            int width= right-left;
            area= Math.min(height[left], height[right])*width;
            maxarea= Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}