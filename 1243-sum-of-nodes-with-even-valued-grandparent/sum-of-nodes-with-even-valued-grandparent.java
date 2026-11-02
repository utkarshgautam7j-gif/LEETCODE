
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return gp(root);
    }

    public int gp(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;

        if (root.val % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null)
                    sum += root.left.left.val;

                if (root.left.right != null)
                    sum += root.left.right.val;
            }

            if (root.right != null) {
                if (root.right.left != null)
                    sum += root.right.left.val;

                if (root.right.right != null)
                    sum += root.right.right.val;
            }
        }

        sum += gp(root.left);
        sum += gp(root.right);

        return sum;
    }
}
