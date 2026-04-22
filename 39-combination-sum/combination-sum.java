class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int start, int[] arr, int target, List<Integer> path, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) continue;

            path.add(arr[i]);
            dfs(i, arr, target - arr[i], path, ans);
            path.remove(path.size() - 1);
        }
    }
}