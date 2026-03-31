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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        if(root!=null) q.offer(root);

        List<List<Integer>> xyz = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ans= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode x= q.poll();
                ans.add(x.val);

                if(x.left !=null) q.offer(x.left);
                if(x.right !=null) q.offer(x.right);
                
            }
            xyz.add(ans);
        }
        return xyz;
    }
}