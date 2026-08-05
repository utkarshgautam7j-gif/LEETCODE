class Solution {
    static final long mod = 1000000007L;

    public int countGoodNumbers(long n) {
        long evenpos = (n + 1) / 2;
        long oddpos = n / 2;

        long evenWay = power(5, evenpos);
        long oddWay = power(4, oddpos);

        return (int)((evenWay * oddWay) % mod);
    }

    private static long power(long base, long exp) {
        long ans = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = (ans * base) % mod;
            }

            base = (base * base) % mod;
            exp >>= 1;
        }

        return ans;
    }
}