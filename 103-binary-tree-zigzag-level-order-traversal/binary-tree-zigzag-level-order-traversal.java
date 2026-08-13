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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<Integer> temp = new ArrayList<>();
        int flag =0;
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t==null){
                ans.add(temp);
                temp = new ArrayList<>();
                flag=1-flag;

                if(!q.isEmpty()) q.offer(null);
            }
            else{
                if(flag==0){
                    temp.add(t.val);

                }
                else{
                    temp.add(0,t.val);
                }
                if(t.left!=null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }
        }
        return ans;
    }
}