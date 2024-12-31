class Solution {
    int [][]dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp=new int[366][1000];
        for(int []i:dp) Arrays.fill(i,-1);
        return call(0,0,0,days,costs);
    }
    public int call(int i,int d,int cnt,int []day,int []cost){
        if(i==day.length) return 0;
        int a=0;
        int b=0;
        int c=0;
        int min=0;
        if(dp[i][d]!=-1) return dp[i][d];
        if(d<day[i]){
            a=cost[0]+call(i+1,day[i],cnt+cost[0],day,cost);
            b=cost[1]+call(i+1,day[i]+6,cnt+cost[1],day,cost);
            c=cost[2]+call(i+1,day[i]+29,cnt+cost[2],day,cost);
            min=Math.min(a,Math.min(b,c));
        }
        else{
            min=call(i+1,d,cnt,day,cost);
        }
        return dp[i][d]=min;
    }
}