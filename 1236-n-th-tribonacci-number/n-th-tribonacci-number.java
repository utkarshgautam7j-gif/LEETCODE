class Solution {
    public int tribonacci(int n) {
        int t0 =0;
        int t1=1;
        int t2=1;
        int ans=0;
        if(n==1||n==2)return 1;
        while(n>=3){
            ans=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=ans;
            n--;
        }
        return ans;
    }
}