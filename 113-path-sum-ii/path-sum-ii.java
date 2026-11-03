
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        path(root, ans, l, targetSum);
        return ans;
    }

    public void path(TreeNode root, ArrayList<List<Integer>> ans,
                     ArrayList<Integer> l, int sum) {

        if (root == null) return;

        l.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                ans.add(new ArrayList<>(l));
            }

            l.remove(l.size() - 1);
            return;
        }

        path(root.left, ans, l, sum - root.val);
        path(root.right, ans, l, sum - root.val);

        l.remove(l.size() - 1);
    }
}
