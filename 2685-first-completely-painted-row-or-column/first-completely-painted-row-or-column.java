class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans=Integer.MAX_VALUE;
        int []map=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            map[arr[i]]=i;
        }
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                max=Math.max(max,map[mat[i][j]]);
            }
            ans=Math.min(max,ans);
        }
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(max,map[mat[j][i]]);
            }
            ans=Math.min(max,ans);
        }
        return ans;
    }
}