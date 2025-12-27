class Solution {
    public boolean checkIfPangram(String sentence) {
        int c=0;
        l:
        for(int i=97;i<=122;i++){
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j)==(char)i){
                    c++;
                    continue l;
                }
            }
        }
        if(c==26){
            return true;
        }
        else{
            return false;
        }
    }
}