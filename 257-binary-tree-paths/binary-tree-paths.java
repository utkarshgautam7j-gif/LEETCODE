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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        String s="";
        path(root,ans,s);
        return ans;
    }
    public void path(TreeNode root,ArrayList<String> l ,String s){

        if(root==null){
            return;
        }
        s=s+root.val;
        
        if(root.left==null && root.right==null){
            l.add(s);
            return;
        }

        s=s+"->";
        path(root.left,l,s);
        path(root.right,l,s);
    }
}