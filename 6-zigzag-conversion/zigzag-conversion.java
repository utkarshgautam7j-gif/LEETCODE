class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String [] pos = new String[numRows];
        int idx=0;
        int f=0;
        for(int i=0;i<numRows;i++){
            pos[i]="";
        }
        while(idx<s.length()){
            if(f==0){
                for(int i=0;i<numRows && idx<s.length();i++){
                    pos[i]=pos[i]+s.charAt(idx);
                    idx++;
                }
                f=1;
            }
            else{
                for(int i=numRows-2;i>=1 && idx<s.length();i--){
                    pos[i]=pos[i]+s.charAt(idx);
                    idx++;
                }
                f=0;
            }
        }

        String ans ="";
        for(int i=0;i<numRows;i++){
            ans=ans+pos[i];
        }
        return ans;
    }
}