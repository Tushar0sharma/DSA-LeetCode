class Solution {
    public int strangePrinter(String s) {
        int n=s.length();
        int [][]dp=new int[n+1][n+1];
        return call(dp,0,n-1,s);
    }
    public int call(int [][]dp,int l,int r,String s){
        if(l==r) return 1;
        if(l>r) return 0;
        if(dp[l][r]!=0) return dp[l][r];
        int i=l+1;
        while(i<=r && s.charAt(i)==s.charAt(l)) i++;
        if(i==r+1) return 1;
        int basic=1+call(dp,i,r,s);
        int min=Integer.MAX_VALUE;
        for(int j=i;j<=r;j++){
            if(s.charAt(j)==s.charAt(l)){
                int ans=call(dp,i,j-1,s)+call(dp,j,r,s);
                min=Math.min(ans,min);
            }
        }
        return dp[l][r]=Math.min(basic,min);
    }
}