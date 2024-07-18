class Solution {
    public int findCircleNum(int[][] arr) {
        boolean[]vis=new boolean[arr.length];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(!vis[i]){
                ans++;
                dfs(vis,arr,i);
            }
        }
        return ans;
    }
    public void dfs(boolean[]vis,int [][]arr,int curr){
        vis[curr]=true;
        for(int i=0;i<arr[curr].length;i++){
            if(arr[curr][i]==1 && !vis[i]) dfs(vis,arr,i);
        }
    }
}