/*
class Solution {
    static long fact(long n) {
        long res = 1;
        for (long i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    static long nCr(long n, long r) {
        if (r > n) return 0;
        return fact(n) / (fact(r) * fact(n - r));
    }
    public int climbStairs(int n) {
        int [] arr = new int [n];
        long ans=0;
        long no1=n;
        long len=n;
        for(int i =0 ;i<n ;i++){
            arr[i]=1;
        }
        while(no1>=0){
            ans=ans+nCr(len,no1);
            len--;
            no1-=2;
        }
        return (int)ans;
        
    }
}
*/

/*
import java.math.BigInteger;

class Solution {

    static BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    static BigInteger nCr(int n, int r) {
        if (r > n) return BigInteger.ZERO;
        return fact(n).divide(fact(r).multiply(fact(n - r)));
    }

    public int climbStairs(int n) {
        BigInteger ans = BigInteger.ZERO;
        int no1 = n;
        int len = n;

        while (no1 >= 0) {
            ans = ans.add(nCr(len, no1));
            len--;
            no1 -= 2;
        }

        return ans.intValue();
    }
}
*/
class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;

    }
}