class Solution {
    public int arrangeCoins(int n) {
        long sum=0;
        int c=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            if(sum<=n){
                c++;
                continue;
            }
            break;


        }
        return c;
    }
}