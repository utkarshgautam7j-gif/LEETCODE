import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String first= strs[0];
       String last = strs[strs.length-1];
       int i=0;
       while(i<first.length() && i<last.length() && first.charAt(i)== last.charAt(i)){
        i++;
       }
       return first.substring(0,i);

    }
}

/*
import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len =  strs.length;
        int [] x = new int[len];
        for(int i=0;i<len;i++){
            x[i]=strs[i].length();
        }
        Arrays.sort(x);
        int f_l=x[0];
        String s="";
        for(int i = 0;i<f_l ; i++){
            for(int j=0; j<len-1;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    return s;
                }
            }
            s=s+strs[0].charAt(i);
        }
        return s;
    }
}
*/

