class Solution {
    private final long Mod=(int) (1e9+7);
    private Long[][][]dp;
    public int checkRecord(int n) {
        dp=new Long[n+1][3][3];
        return (int)(solve(n,0,0)%Mod);
    }
    public boolean check(int absent,int late){
        if(late>=3){
            return false;
        }
        if(absent>=2){
            return false;
        }
        return true;
    }
    public long solve(  int n,int absent ,int late ){
        if(!check(absent,late)){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n][absent][late]!=null){
            return dp[n][absent][late];
        }
        long absence=solve(n-1,absent+1,0);
        long present=solve(n-1,absent,0);
        long lately=0;
        if(late<2){
            lately=solve(n-1,absent,late+1);
        }
        return dp[n][absent][late]=(absence+present+lately)%Mod;
    } 
}