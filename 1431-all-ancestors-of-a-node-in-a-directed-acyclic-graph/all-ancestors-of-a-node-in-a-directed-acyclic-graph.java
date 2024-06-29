class Solution {
        public List<List<Integer>> getAncestors(int n, int[][] edges) {
        Map<Integer, List<Integer>> parentToKids = new HashMap<>();
        for (int[] e : edges) {
            parentToKids.computeIfAbsent(e[0], l -> new ArrayList<>()).add(e[1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < n; ++i) {
            dfs(i, i, ans, parentToKids);
        }
        return ans;
    }
    private void dfs(int ancestor, int kid, List<List<Integer>> ans, Map<Integer, List<Integer>> parentToKids) {
        List<Integer> ancestors = ans.get(kid);
        if (ancestors.isEmpty() || ancestors.get(ancestors.size() - 1) != ancestor) {
            if (ancestor != kid) {
                ancestors.add(ancestor);
            }
            for (int grandKid : parentToKids.getOrDefault(kid, Arrays.asList())) {
                dfs(ancestor, grandKid, ans, parentToKids);
            }
        }
    }
}