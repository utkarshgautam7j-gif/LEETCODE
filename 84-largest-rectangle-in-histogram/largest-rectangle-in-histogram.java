import java.util.Arrays;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n =  heights.length;
        Stack<Integer> left_min = new Stack<>();
        Stack<Integer> right_min = new Stack<>();
        int [] rig_min_idx = new int [n];
        int [] left_min_idx = new int [n];
        int k=0;
        for(int i=0;i<n;i++){
            while(!left_min.isEmpty() && heights[i]<=heights[left_min.peek()]){
                left_min.pop();
            }
            if(left_min.isEmpty()){
               left_min_idx[k++]=-1; 
            }
            else{
                left_min_idx[k++]=left_min.peek();
            }
            left_min.push(i);
        }
        int x=n-1;
        for(int j=n-1;j>=0;j--){
            while(!right_min.isEmpty() && heights[j]<=heights[right_min.peek()]){
                right_min.pop();
            }
            if(right_min.isEmpty()){
                rig_min_idx[x--]=n;
            }
            else{
                rig_min_idx[x--]=right_min.peek();
            }
            right_min.push(j);
        }
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp=0;
            temp=(rig_min_idx[i] - left_min_idx[i] -1) * heights[i];
            area= Math.max(temp,area); 
        }
        return area;
    }
}




/*
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> monost= new Stack<>();
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int max_area=0;
        int min_height=heights[heights.length-1];
        int horizontal_area=0;
        for(int i=heights.length-1;i>=0;i--){
            
            st.push(heights[i]);
            min_height=Math.min(min_height,st.peek());
            horizontal_area=min_height*st.size();
            if(!monost.isEmpty() && monost.peek()<heights[i]){
                monost.clear();
            }
            monost.push(heights[i]);
            area=(monost.peek()*monost.size());
            max_area= Math.max(max_area,Math.max(area,horizontal_area));



        }
        return max_area;
    }
}
*/
/*
class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int left = i;
            while (left >= 0 && heights[left] >= height) {
                left--;
            }
            int right = i;
            while (right < n && heights[right] >= height) {
                right++;
            }
            int width = right - left - 1;
            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
*/

