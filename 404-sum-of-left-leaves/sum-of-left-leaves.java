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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
       return sumleaf(root,sum);
       
    }
    public static int sumleaf(TreeNode root,int sum){
        if(root==null) return sum ;
        if(root.left!=null&& root.left.left==null && root.left.right==null){
            sum=sum+root.left.val;
        }
        
        sum=sumleaf(root.left,sum);
        sum=sumleaf(root.right,sum);
        return sum;
    }
}