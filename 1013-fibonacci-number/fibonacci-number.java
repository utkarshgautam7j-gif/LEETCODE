class Solution {
    public int fib(int n) {
        int a=0;//1st
        int b=1;//2nd
        int c=1;//next
        if(n==0)return 0;
        for(int i =2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}