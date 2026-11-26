class Solution {
    int ans = Integer.MAX_VALUE;
    int prev = -1;
    public int getMinimumDifference(TreeNode root) {

        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev != -1) {
            ans = Math.min(ans, root.val - prev);
        }

        prev = root.val;

        inorder(root.right);
    }
}