class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int l=0,n=arr.length,r=arr.length-1;
        while(l<n-1 && arr[l]<=arr[l+1]) l++;
        if(l==n-1) return 0;
        while(r>0 && arr[r-1]<=arr[r]) r--;
        int ans=Math.min(n-l-1,r);
        int i=0;
        int j=r;
        while(i<=l && j<n){
            if(arr[i]<=arr[j]){
                ans=Math.min(ans,j-i-1);
                System.out.println(i+" "+j);
                i++;
            }else{
                j++;
            }
        }   
        return ans;
    }
}