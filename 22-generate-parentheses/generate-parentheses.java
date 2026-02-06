class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a= new ArrayList<>();
        String ans="";
        f(n,0,0,ans,a);
        return a;
        
        
    }
    private static void f(int n,int open,int close,String ans,List<String>a){

        if(open ==n && close==n){
            a.add(ans);
            return;
        }

        if(open<n){
            f(n,open+1,close,ans+"(",a);
        }
        if(close<open){
            f(n,open,close+1,ans+")",a);
        }

    }
}