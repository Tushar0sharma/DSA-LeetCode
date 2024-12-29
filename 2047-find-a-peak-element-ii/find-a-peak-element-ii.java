class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l=0;
        int r=mat[0].length-1;
        while(l<=r){
            int mid=(l+r)/2;
            int maxidx=call(mat,mid);
            int left=(mid-1>=0)?mat[maxidx][mid-1]:-1;
            int right=(mid+1<mat[0].length)?mat[maxidx][mid+1]:-1;
            if(left<mat[maxidx][mid] && right<mat[maxidx][mid]) return new int[]{maxidx,mid};
            else if(left>mat[maxidx][mid]) r=mid-1;
            else l=mid+1;
        }
        return new int[]{-1,-1};
    }
    public int call(int [][]mat,int k){
        int max=-1,ans=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][k]>max){
                max=mat[i][k];
                ans=i;
            }
        }
        return ans;
    }
}