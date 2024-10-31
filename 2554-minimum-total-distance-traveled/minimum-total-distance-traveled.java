class Solution {
    int n=0;
    int m=0;
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        ArrayList<Integer> fac=new ArrayList<>();
        for(int i=0;i<factory.length;i++){
            for(int j=0;j<factory[i][1];j++){
                fac.add(factory[i][0]); // sare factory ke position ko limit time add
            }
        }
        Collections.sort(fac);
        Collections.sort(robot);
         m=fac.size();
         n=robot.size();
        long dp[][]=new long[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        return solve(n,m,dp,fac,robot);
    }
    public long solve(int i,int j,long dp[][],ArrayList<Integer> fac,List<Integer> robot){
        if(i==0){
            return 0L; //consumed all robot
        }
        if(j==0){
            return Long.MAX_VALUE; //consumed all factory
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        long ans1=solve(i-1,j-1,dp,fac,robot); //ye factory cosume hoke jo minimum
        long ans2=solve(i,j-1,dp,fac,robot);//ye factory ni consume honne pe minimum ya skip krne pe
       if(ans1!=Long.MAX_VALUE){
           ans2= Math.min(ans1+Math.abs(robot.get(i-1)-fac.get(j-1)),ans2);
       }
        return dp[i][j]=ans2;
        
    }
}