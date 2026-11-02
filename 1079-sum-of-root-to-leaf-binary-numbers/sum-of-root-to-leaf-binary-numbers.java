/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        
        ArrayList<String> l = new ArrayList<>();
        String s="";
        helper(root,l,s);

        int ans =0;
        for(int i=0;i<l.size();i++){
            ans = ans +Integer.parseInt(l.get(i),2);
        }
        return ans;
    }
    public void helper(TreeNode p , ArrayList<String> l ,String s){

        if(p==null) return;
        s=s+p.val;

        if(p.left==null && p.right==null){
            l.add(s);
            return;
        }

        helper(p.left,l,s);
        helper(p.right,l,s);
        return;



    }
}