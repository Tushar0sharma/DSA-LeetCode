class Solution {
    public int maximumLength(String s) {
        int n=s.length();
        int [][]dp=new int [26][n+1];
        int cnt=1;
        for(int i=0;i<n;i++){
            int k=s.charAt(i)-'a';
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
            else{
                cnt=1;
            }
            dp[k][cnt]++;
        }
        int max=0;
        for(int i=0;i<26;i++){
            for(int j=n;j>=0;j--){
                if(j<n) dp[i][j]+=dp[i][j+1];
                if(dp[i][j]>=3){
                    max=Math.max(j,max);
                    break;
                }
            }
        }
        return max==0?-1:max;
    }
}