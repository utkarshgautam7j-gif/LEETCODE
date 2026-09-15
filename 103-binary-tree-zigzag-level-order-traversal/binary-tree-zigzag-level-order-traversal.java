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
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        bfs(root,arr,ans);
        return ans;

    }
    private static void bfs(TreeNode root,List<Integer> arr,List<List<Integer>>ans){
        Deque<TreeNode>q = new LinkedList<>();

         if(root == null) return;

        q.add(root);  
        int flag =0;

        while(!q.isEmpty()){
            int size =q.size();
            arr=new ArrayList<>();
            TreeNode n;
            while(size-- >0){
                if(flag==0){
                    n =q.removeFirst();
                    arr.add(n.val);
                    if(n.left!=null)q.addLast(n.left);
                    if(n.right!=null)q.addLast(n.right);
                }
                else{
                    n=q.removeLast();
                    arr.add(n.val);
                    if(n.right!=null)q.addFirst(n.right);
                    if(n.left!=null)q.addFirst(n.left);
                }
            }
            ans.add(arr);
            flag=1-flag;
        }

    }
}