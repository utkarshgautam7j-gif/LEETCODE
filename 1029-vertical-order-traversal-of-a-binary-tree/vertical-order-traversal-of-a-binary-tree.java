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
 
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> map= new HashMap<>();
        horizontal(root,0,map);
        for (int i = 0; i < map.size(); i++) {
            list.add(map.get(i));
        }
        return list;
    }
    private void horizontal(TreeNode root, int level,Map<Integer, List<Integer>> map){
        if(root==null) return;

        if (!map.containsKey(level)) {
            map.put(level, new ArrayList<>());
        }

        map.get(level).add(root.val);
        horizontal(root.left,level-1,map);
        horizontal(root.right,level+1,map);

    }
}

*/

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        // column -> row -> values
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map =
                new TreeMap<>();

        horizontal(root, 0, 0, map);

        for (TreeMap<Integer, List<Integer>> rows : map.values()) {

            List<Integer> temp = new ArrayList<>();

            for (List<Integer> values : rows.values()) {
                Collections.sort(values);
                temp.addAll(values);
            }

            ans.add(temp);
        }

        return ans;
    }

    private void horizontal(TreeNode root, int row, int col,
                             TreeMap<Integer, TreeMap<Integer, List<Integer>>> map) {

        if (root == null) {
            return;
        }

        if (!map.containsKey(col)) {
            map.put(col, new TreeMap<>());
        }

        if (!map.get(col).containsKey(row)) {
            map.get(col).put(row, new ArrayList<>());
        }

        map.get(col).get(row).add(root.val);

        horizontal(root.left, row + 1, col - 1, map);

        horizontal(root.right, row + 1, col + 1, map);
    }
}