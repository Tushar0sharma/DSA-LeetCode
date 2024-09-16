class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int []dp=new int[n];
        int max=0;
        for(int i=1;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') continue;
            if(s.charAt(i-1)=='('){
                int k=0;
                if(i-2>=0) k=dp[i-2];
                dp[i]=k+2;
            }
            else{
                int mat=i-dp[i-1]-1;
                if(mat>=0 && s.charAt(mat)=='('){
                    int k=0;
                    if(mat-1>=0) k=dp[mat-1];
                    dp[i]=dp[i-1]+k+2;
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}