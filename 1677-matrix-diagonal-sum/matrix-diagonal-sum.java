/*
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if((i==j) || (i+j == n-1)){
                    sum=sum + mat[i][j];
                }
            }
        }

        return sum;
    }
}
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
            sum=sum+mat[i][n-1-i];  
        }
        if(n%2!=0){
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
}

