class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        Map<Integer, List<Integer>> map = new HashMap<>();

        Level(root, 0, map);

        for (int i = 0; i < map.size(); i++) {
            ans.add(map.get(i));
        }

        return ans;
    }

    private void Level(TreeNode root, int level,
                       Map<Integer, List<Integer>> map) {

        if (root == null) {
            return;
        }

        if (!map.containsKey(level)) {
            map.put(level, new ArrayList<>());
        }

    
        map.get(level).add(root.val);


        Level(root.left, level + 1, map);

  
        Level(root.right, level + 1, map);
    }
}