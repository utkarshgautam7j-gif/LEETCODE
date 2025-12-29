/*
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];


            for (int j = 0; j < n; j++) {
                ans[r][j]++;
            }

            for (int j = 0; j < m; j++) {
                ans[j][c]++;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
*/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [] r=new int[m];
        int [] c= new int[n];
        for(int i=0;i<indices.length;i++){
            r[indices[i][0]]++;
            c[indices[i][1]]++;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((r[i]+c[j]) % 2 !=0){
                    count++;
                }
            }
        }
        return count;
    }
}
