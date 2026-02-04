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