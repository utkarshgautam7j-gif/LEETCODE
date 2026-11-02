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
    public int deepestLeavesSum(TreeNode root) {
        
        int ans =0;
        if(root==null) return ans;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){

            int size = q.size();
            int sum=0;

            for(int i=0;i<size;i++){
                TreeNode front = q.remove();

                sum+=front.val;
                if(front.left!=null) q.offer(front.left);
                if(front.right!=null)q.offer(front.right);

            }
            ans=sum;
        }
        return ans;



    }
}