/*
class Solution {
    public int addDigits(int num) {
        if(num<9) return num;
        int sum =num;

        while(sum>9){
            int ans=0;
            while(sum>0){
                ans=ans+(sum%10);
                sum=sum/10;
            }
            sum=ans;

        }
        return sum;
    }
}
*/
class Solution {
    public int addDigits(int num) {
        return recur(num);

        
    }
    private static int recur(int n){
        int sum=0;
        if(n<10){
            return n;
        }
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return recur(sum);

        
    }
}