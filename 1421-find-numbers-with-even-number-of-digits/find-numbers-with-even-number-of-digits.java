class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int x: nums){
            if((x>9 && x<100) || (x>999 && x<10000) || (x==100000)){
                c++;
            }
        }
        return c;
    }
}