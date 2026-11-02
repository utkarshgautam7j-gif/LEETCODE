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
    public int goodNodes(TreeNode root) {
        TreeNode p = root;
        return good(p,Integer.MIN_VALUE);
    }
    public int good(TreeNode p,int max ){
        if(p==null) return 0;

        int count = 0;
        if(p.val>=max){
            count =1;
        }
        
        int new_max = Math.max(max,p.val);

        return count +good(p.left,new_max)+good(p.right,new_max);

    }
}