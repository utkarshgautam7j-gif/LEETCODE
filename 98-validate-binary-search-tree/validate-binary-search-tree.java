/*
class Solution {
    long prev = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        if (root.val <= prev) return false;
        prev = root.val;

        return isValidBST(root.right);
    }
}
*/
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return helper(root.left, min, root.val) &&
               helper(root.right, root.val, max);
    }
}