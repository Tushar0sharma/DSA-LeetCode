class Solution {
    public boolean canCross(int[] stones) {
        if(stones[1]-stones[0]!=1) return false;
        Boolean [][]dp=new Boolean[stones.length][stones.length];
        return call(1,1,stones,dp);
    }
    public boolean call(int i,int jump,int []stones,Boolean[][]dp){
        if(i>=stones.length) return false;
        if(i==stones.length-1) return true;
        if(dp[i][jump]!=null) return dp[i][jump];
        boolean ans=false;
        for(int j=i+1;j<stones.length;j++){
            if(stones[j]-stones[i]>jump+1) break;
            for(int k=-1;k<=1;k++){
                if(stones[j]-stones[i]==jump+k){
                    ans=ans||call(j,jump+k,stones,dp);
                }
            }
        }
        return dp[i][jump]=ans;
    }
}