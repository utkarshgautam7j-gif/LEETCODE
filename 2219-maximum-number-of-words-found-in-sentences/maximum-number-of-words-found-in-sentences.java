class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        int n= sentences.length;
        for(int i=0;i<n;i++){
            String [] arr=sentences[i].split(" ");
            max=Math.max(max,arr.length);

        }
        return max;
        
    }
}