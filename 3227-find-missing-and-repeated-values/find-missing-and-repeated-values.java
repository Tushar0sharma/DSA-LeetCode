class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans=new int[2];
        Set<Integer>s=new HashSet<>();
        int sum=0;
        for(int []i:grid){
            for(int j:i){
                if(!s.add(j)) ans[0]=j;
                else sum+=j;
            }
        }
        int n=grid.length;
        n*=n;
        int total=n*(n+1)/2;
        ans[1]=total-sum;
        return ans;
    }
}