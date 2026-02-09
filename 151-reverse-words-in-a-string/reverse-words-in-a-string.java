class Solution {
    public String reverseWords(String str) {
        String s=str.trim();
        String [] arr = s.split("\\s+");
        String ans="";
        for(int i =arr.length-1 ;i>=0;i--){
            ans=ans+arr[i];
            if(i==0) continue;
            ans=ans+" ";
        }
        return ans;

    }
}