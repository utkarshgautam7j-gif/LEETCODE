class Solution {
    public int myAtoi(String s) {
        String ans = s.stripLeading();
        if(ans.length()==0) return 0;
        int sign =1;
        int i=0;
        if(ans.charAt(0)=='+'){
            sign=1;
            i++;
        }
        if(ans.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        long num=0;
        while(i<ans.length() && Character.isDigit(ans.charAt(i))){
            num=num*10 +(ans.charAt(i)-'0');

            if(sign==1 && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign ==-1 && -num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
          
        }
        return (int) (sign * num);




    }
}