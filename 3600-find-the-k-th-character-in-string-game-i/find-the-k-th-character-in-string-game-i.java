class Solution {
    public char kthCharacter(int k) {
        String word="a";
        while(word.length()<k){
            String connecting_string="";
            for(int i=0;i<word.length();i++){
                connecting_string +=(char)(word.charAt(i)+1);
            }
            word=word+connecting_string;
        }
        return(word.charAt(k-1));
    }
}