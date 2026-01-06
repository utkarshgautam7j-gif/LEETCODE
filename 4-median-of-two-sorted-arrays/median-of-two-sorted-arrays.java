class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        int m = nums1.length;
        int n = nums2.length;
        int [] x = new  int [m+n];
        double med=0;
        int a= 0;
        int b = 0;
        while (a<m || b<n){
            if (a<m){
                x[k++] = nums1[a++];
            }
            if(b<n){
                x[k++] = nums2[b++];
            }    
        
    }
    Arrays.sort(x);
    if ((m+n) % 2 == 0){
        int t = (m +  n)/2;
        med =( x[t] + x[t -1] )/ 2.0;
    }
    if ((m+n) % 2 !=0){
        int t= m + n;
        med =( x[(t/2)]);
    }
    return med;

}
}