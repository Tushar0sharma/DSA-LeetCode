class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int res=0,up=0,down=0;
        for(int i=1;i<n;i++){
            if(down>0 && arr[i-1]<arr[i] || arr[i-1]==arr[i]) up=down=0;
            if(arr[i]>arr[i-1]) up++;
            if(arr[i]<arr[i-1]) down++;
            if(up>0 && down>0 && res<down+up+1) res=up+down+1;
        }   
        return res;
    }
}