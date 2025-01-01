class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l=matrix[0][0];
        int n=matrix.length;
        int r=matrix[n-1][n-1];
        while(l<=r){
            int mid=(l+r)/2;
            int []p=call(matrix,mid);
            if(p[0]==k) return p[1];
            if(p[0]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
    public int[] call(int [][]mat,int mid){
        int n=mat.length;
        int j=n-1;
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<n;i++){
            while(j>=0 && mat[i][j]>mid){
                j--;
            }
            if(j>=0){
                cnt+=(j+1);
                max=Math.max(max,mat[i][j]);
            }
            else{
                break;
            }
        }
        return new int[]{cnt,max};
    }
}