class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        Level(root, list, 0);

        return list;
    }

    private void Level(TreeNode root, List<List<Integer>> list, int level) {

        if (root == null) {
            return;
        }

        if (level == list.size()) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(root.val);

        
        Level(root.left, list, level + 1);

        
        Level(root.right, list, level + 1);
    }
}