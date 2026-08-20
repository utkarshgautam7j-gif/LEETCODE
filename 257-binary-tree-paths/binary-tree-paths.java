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
        List<String> l = new ArrayList<>();
        String s ="";
        path(root,s,l);
        return l;

       

    }
    private static void path(TreeNode root, String s, List<String> l){
         if(root==null) return ;
        s+=root.val;
        if(root.left==null && root.right==null){
            l.add(s);
            return;
        }
        s+="->";
        path(root.left,s,l);
        path(root.right,s,l);
        return ;
    }
}