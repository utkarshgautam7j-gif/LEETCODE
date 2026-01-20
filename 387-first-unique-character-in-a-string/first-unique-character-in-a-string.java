class Solution {
    public int firstUniqChar(String s) {
        int len=s.length();
        int ans=-1;
        l:
        for(int i =0 ;i<len;i++){
            for(int j=0;j<len;j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    continue l;
                }
            }
            ans=i;
            break;
        }
        return ans;

    }
}