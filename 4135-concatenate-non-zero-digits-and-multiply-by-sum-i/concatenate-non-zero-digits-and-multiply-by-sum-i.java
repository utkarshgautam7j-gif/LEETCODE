class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        long ans =0;
        long place=1;
        while(n>0){
            long dig = n%10;
            if(dig!=0){
                ans=ans+(dig*place);
                sum=sum+dig;
                place =place*10;
            }
            n=n/10;
        }
        return ans*sum;
    }
}