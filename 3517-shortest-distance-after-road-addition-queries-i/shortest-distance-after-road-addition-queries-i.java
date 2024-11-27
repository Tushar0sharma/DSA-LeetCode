class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> ll = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ll.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            ll.get(i).add(i + 1);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ll.get(queries[i][0]).add(queries[i][1]);
            ans[i] = bfs(ll);
        }
        return ans;
    }

    public int bfs(List<List<Integer>> ll) {
        int d = 0;
        boolean[] vis = new boolean[ll.size()];
        vis[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int s = q.size();
            while (s-- > 0) {
                int p = q.poll();
                if (p == ll.size() - 1)
                    return d;
                for (int i : ll.get(p)) {
                    if (!vis[i]) {
                        vis[i] = true;
                        q.add(i);
                    }
                }
            }
            d++;
        }
        return -1;
    }
}