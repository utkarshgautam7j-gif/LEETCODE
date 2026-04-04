class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int [nums1.length];
        Stack <Integer> stack = new Stack<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int curr= nums2[i];
            while(!stack.isEmpty() && stack.peek()<=curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(curr,-1);
            }
            else{
                map.put(curr,stack.peek());
            }
            stack.push(curr);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}


/*
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr[k++]=j;
                }
            }
        }
        l:
        for(int i=0;i<nums1.length;i++){
            for(int j=arr[i];j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    nums1[i]=nums2[j];
                    continue l;
                }
            }
            nums1[i]=-1;
        }
        return nums1;

    }
}
*/