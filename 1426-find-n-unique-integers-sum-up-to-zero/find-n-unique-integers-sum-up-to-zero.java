class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        if(n%2==0){
            int i=0;
            int j=n-1;
            while(i<j){
                arr[i]=(-1*(n/2))+i;
                arr[j]=(n/2)-i;
                i++;
                j--;
            }
        }
        else{
            int i=0;
            int j=n-1;
            while(i<=j){
                arr[i]=(-1*(n/2))+i;
                arr[j]=(n/2)-i;
                i++;
                j--;
            }
        }
        return arr;
    }
}