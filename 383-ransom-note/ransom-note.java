class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] m=magazine.toCharArray();
        char [] r=ransomNote.toCharArray();
        boolean [] visited =new boolean[m.length];
        int total=r.length;
        int k=0;
        l:
        for(int i=0;i<r.length;i++){
            for(int j=0;j<m.length;j++){
                if(visited[j]==true) continue;
                if(r[i]==m[j]){
                    k++;
                    visited[j]=true;
                    if(k==total){
                        return true;
                    }
                    continue l;
                }
            }
        }
        return false;
    }
}