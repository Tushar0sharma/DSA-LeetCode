class Solution {
    public boolean canReach(int[] arr, int start) {
        if(start>=arr.length || start<0) return false;
        if(arr[start]<0) return false;
        if(arr[start]==0) return true;
        arr[start]=-arr[start];
        return canReach(arr,start+arr[start])||canReach(arr,start-arr[start]);
    }
}