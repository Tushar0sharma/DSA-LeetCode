class Solution {
    public int[] sortArray(int[] nums) {
        int[]a=f(nums,0,nums.length-1);
        return a;
    }
    public int[] f(int []nums,int s,int e){
        if(s==e){
            int[]a=new int[1];
            a[0]=nums[s];
            return a;
        }
        int mid=(s+e)/2;
        int[] arr1=f(nums,s,mid);
        int[] arr2=f(nums,mid+1,e);
        return merge(arr1,arr2);
    }
    public int[] merge(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[]ans=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
               ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}