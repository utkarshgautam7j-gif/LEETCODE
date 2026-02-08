class Solution {
    public String removeOuterParentheses(String s) {
        int n= s.length();
        String ans="";
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
                if(open!=1){
                    ans=ans+"(";
                }
            }
            else{
                close++;
                if(close<open){
                    ans=ans+")";
                }
                else{
                    open=0;
                    close=0;
                }
            }
        }
        return ans;
    }
}