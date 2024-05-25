class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[]ans=new boolean[queries.length];
        int []check=new int[nums.length];
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]%2 == nums[i]%2){
                cnt++;
            }
            check[i]=cnt;
        }
        int k=0;
        int m=queries.length;
        for(int[] i:queries){
            int mistake=check[i[1]]-check[i[0]];
            if(mistake==0) ans[k]=true;
            k++;
        }
        return ans;
    }
}