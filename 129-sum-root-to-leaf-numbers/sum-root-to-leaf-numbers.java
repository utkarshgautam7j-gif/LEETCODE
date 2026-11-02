
class Solution {
    int ans = 0;

    public int sumNumbers(TreeNode root) {
        TreeNode p = root;
        int sum = 0;

        pathSum(p, sum);
        return ans;
    }

    public void pathSum(TreeNode p, int sum) {
        if (p == null) {
            return;
        }

        sum = (sum * 10) + p.val;

        if (p.left == null && p.right == null) {
            ans = ans + sum;
            return;
        }

        pathSum(p.left, sum);
        pathSum(p.right, sum);
    }
}
