class Solution {
    public char findKthBit(int n, int k) {
        String []dp=new String[n+3];
        dp[1]="0";
        dp[2]="011";
        dp[3]="0111001";
        if(n<=3) return dp[n].charAt(k-1);
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+"1"+call(dp[i-1]);
        }
        return dp[n].charAt(k-1);
    }
    public String call(String s){
        StringBuilder a=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='0') a.append('1');
            else a.append('0');
        }
        return a.reverse().toString();
    }
}