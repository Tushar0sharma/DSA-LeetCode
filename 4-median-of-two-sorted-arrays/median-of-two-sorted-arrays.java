class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
        int []arr=new int[k];
        int a=0;
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[a++]=nums1[i++];
            }
            else{
                arr[a++]=nums2[j++];
            }
        }
        while(i<n){
            arr[a++]=nums1[i++];
        }
        while(j<m){
            arr[a++]=nums2[j++];
        }
        if(k%2!=0){
            return arr[k/2];
        }
        else{
            return (double)(arr[k/2]+arr[(k/2)-1])/2.0;
        }
    }
}