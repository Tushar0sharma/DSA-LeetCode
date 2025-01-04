class Solution {
    int [][]dp;
    int mod=(int)1e9+7;
    public int countPalindromes(String s) {
        dp=new int[10001][5];
        int cnt=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                char x=(char)(i+'0');
                char y=(char)(j+'0');
                char[]ch={x,y,'.',y,x};
                for(int []r:dp) Arrays.fill(r,-1);
                int a=(call(0,0,ch,s))%mod;
                cnt=(cnt+a)%mod;
            }
        }
        return cnt;
    }
    public int call(int i,int j,char []ch,String s){
        if(j==5){
            return 1;
        }
        if(i>=s.length()){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int a=0,b=0;
        if(ch[j]==s.charAt(i)|| j==2){
            a=call(i+1,j+1,ch,s)%mod;
        }
        b=call(i+1,j,ch,s)%mod;
        return dp[i][j]=(a+b)%mod;
    }
}