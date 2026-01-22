class Solution {
    public int firstUniqChar(String s) {
        int[] arr= new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}


/*
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

*/