class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int n = s.length();
        int c=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) c++;
        }
        return c;
        
    }
}