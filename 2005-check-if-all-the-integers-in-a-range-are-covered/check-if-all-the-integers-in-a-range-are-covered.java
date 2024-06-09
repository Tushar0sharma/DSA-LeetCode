class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[]arr=new int[52];
        for(int[]range:ranges){
            int st=range[0];
            int en=range[1];
            for(int i=st;i<=en;i++){
                arr[i]=1;
            }            
        }
        for(int i=left;i<=right;i++){
            if(arr[i]!=1) return false;
            // System.out.print(arr[i]+" ");
        }
        return true;
    }
}