class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
        int cnt1=0;
        int cnt2=0;
        int a=0;
        int i=0,j=0;
        System.out.println((k/2)+" "+(k/2-1));
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                if(a==(k/2-1)) cnt1=nums1[i];
                if(a==(k/2)) {
                    cnt2=nums1[i];
                }
                i++;
                a++;
            }
            else{
                if(a==(k/2-1)) cnt1=nums2[j];
                if(a==(k/2)){
                    cnt2=nums2[j];
                }
                j++;
                a++;
            }
            System.out.println(cnt1+" "+cnt2);
        }
        while(i<n){
            if(a==(k/2-1)) cnt1=nums1[i];
            if(a==(k/2)){
                cnt2=nums1[i];
                break;
            }
            i++;
            a++;
        }
        while(j<m){
            if(a==(k/2-1)) cnt1=nums2[j];
            if(a==(k/2)){
                cnt2=nums2[j];
                break;
            }
            j++;
            a++;
        }
        System.out.println(cnt1+" "+cnt2);
        if(k%2!=0){
            return cnt2;
        }
        else{
            return (cnt1+cnt2)/2.0;
        }
    }
}