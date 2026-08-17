class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st =0;
        int end = m*n - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;

        
    }
}





/*

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;

        int row = matrix[0].length; // columns
        int col = matrix.length;    // rows

        int j = matrix[0].length - 1;

        while (i < col && j >= 0) {

            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                j--;   // left
            }
            else {
                i++;   // down
            }
        }

        return false;
    }
}


*/


/*   Line 5: Linear scan of rows results in O(m + log n) time complexity, violating the O(log(m * n)) requirement.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int operation_row=-1;
        for(int i =0;i<n;i++){
            int last= matrix[i].length-1;
            if(matrix[i][last]==target) return true;
            else if(matrix[i][last]>target){
                operation_row=i;
                break;
            }
        }
        if (operation_row == -1) {
            return false;
        }
        int st =0;
        int end = matrix[operation_row].length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[operation_row][mid]==target) return true;
            else if(matrix[operation_row][mid]<target){
                st=mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return false;
    }
}
*/