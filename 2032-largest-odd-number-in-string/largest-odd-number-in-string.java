class Solution {
    public String largestOddNumber(String num) {
        int n= num.length();
        int pivot=0;
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1) {
            pivot =i;
            return num.substring(0,pivot+1); 
            }
        }
        return "";
        
    }
}