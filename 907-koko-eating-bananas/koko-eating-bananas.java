class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i =0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int st=1;
        int end =max;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int mid=st+(end-st)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum=sum+(piles[i]+mid-1)/mid; //(piles[i]+mid-1)/mid ciel of piles[i] / mid

            }
            if(sum<=h){
                ans=mid;
                end = mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
}