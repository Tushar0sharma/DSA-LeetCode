class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] allArray = new int[arr[arr.length-1]+k];
        for(int i = 0; i<arr[arr.length-1]+k;i++){
            allArray[i]=i+1;
        }
        for(int j=0; j<arr.length;j++){
            // int index = binarySearch(allArray, arr[j]);
            allArray[arr[j]-1]=-1;
        }
        int count=0;
        
        for(int l: allArray){
            if(l== -1){
                
                continue;
            }else{
                count++;
            }
            if( count == k){
                return allArray[l-1];
            }

        }
        return -1;
    }

    public int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]> key){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}