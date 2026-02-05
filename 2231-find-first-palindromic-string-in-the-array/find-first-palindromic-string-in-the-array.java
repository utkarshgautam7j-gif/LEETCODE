class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String ans = rev(words[i]);
            if(words[i].equals(ans)){
                return words[i];
            }
        }
        return "";
        
    }
    private  static String rev(String s){
        StringBuilder sb = new StringBuilder ();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}