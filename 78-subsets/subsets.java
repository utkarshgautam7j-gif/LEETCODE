class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        ps(nums,temp,0,ans);
        return ans;
    }
    public static void ps(int [] arr,List<Integer>l,int index,List<List<Integer>> ans){
        if(index==arr.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[index]);
        ps(arr,l,index+1,ans);

        l.remove(l.size()-1);

        ps(arr,l,index+1,ans);
    }
}