class Solution {
    public int longestMountain(int[] arr) {
        int  n=arr.length;
        int []up=new int[n];
        int []down=new int[n];
        int res=0;
        for(int i=n-2;i>=0;i--) if(arr[i]>arr[i+1]) down[i]=down[i+1]+1;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]>arr[i-1]) up[i]=up[i-1]+1;
            if(up[i]>0 && down[i]>0) res=Math.max(res,down[i]+up[i]+1);
        }
        return res;
    }
}