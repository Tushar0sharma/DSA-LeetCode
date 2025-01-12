import java.util.*;

class Solution {
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        int l = 1, r = (int) 1e6, ans = -1;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if (call(mid, edges, threshold, n)) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public boolean call(int mid,int [][]edges,int t,int n){
        List<List<int[]>>ll=new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(new ArrayList<>());
        for(int []i:edges){
            ll.get(i[1]).add(new int[]{i[0],i[2]});
        }
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        boolean []vis=new boolean[n];
        while(!q.isEmpty()){
            int p=q.poll();
            vis[p]=true;
            for(int []i:ll.get(p)){
                if(i[1]<=mid && !vis[i[0]]){
                    vis[i[0]]=true;
                    q.add(i[0]);
                }
            }
        }
        for(boolean b:vis) if(!b) return false;
        return true;        
    }
}
