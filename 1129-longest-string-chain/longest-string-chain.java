class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n=words.length;
        int max=0;
        int []dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]+1>dp[i] && compare(words[i],words[j])){
                    dp[i]=dp[j]+1;
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
    public boolean compare(String s1,String s2){
        if(s2.length()+1!=s1.length()) return false;
        int i=0;
        int j=0;
        while(i<s1.length()){
            if(j<s2.length() && s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            i++;
        }
        return ( j==s2.length());
    }
}