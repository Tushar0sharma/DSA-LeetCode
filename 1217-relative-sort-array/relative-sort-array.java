class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int []arr=new int [1001];
        for(int a:arr1){
            arr[a]++;
        }
        int []ans=new int[arr1.length];
        int idx=0;
        for(int i:arr2){
            while(arr[i]>0){
                ans[idx++]=i;
                arr[i]--;
            }
        }
            for(int i=0;i<arr.length;i++){
                while(arr[i]>0){
                    ans[idx++]=i;
                    arr[i]--;
                }
            }

        return ans;
    }
}