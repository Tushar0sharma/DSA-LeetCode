class Solution {
    public int maxChunksToSorted(int[] arr) {
        int cnt=0;
        int c=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=i;
            c+=arr[i];
            if(c==sum) cnt++;
        }
        return cnt;
    }
}