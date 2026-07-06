class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>=1){
            int n=columnNumber%26;
            if(n==0){
                n=26;
                columnNumber--;
            }
            ans = (char)('A'+(n-1))+ans;
            columnNumber=columnNumber/26;
        }
        return ans;
    }
}