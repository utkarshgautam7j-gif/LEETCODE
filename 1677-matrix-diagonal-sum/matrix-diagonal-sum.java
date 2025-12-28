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
        //if(n%2 !=0) sum=sum-mat[n-1][n-1];
        return sum;
    }
}