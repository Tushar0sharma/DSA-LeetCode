class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int []arr=new int[101];
        for(List<Integer>num:nums){
            int start=num.get(0);
            int end=num.get(1);
            for(int i=start;i<=end;i++){
                arr[i]=1;
            }
        }
        int cnt=0;
        for(int a:arr){
            if(a==1) cnt++;
        }
        return cnt;
    }
}