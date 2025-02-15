class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ll=new ArrayList<>();
        List<String>l=new ArrayList<>();
        int n=s.length();
        boolean[][]dp=new boolean[n][n];
        for(int len=1;len<=n;len++){
            for(int i=0;i+len-1<n;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=(len<=2)||dp[i+1][j-1];
                }
            }
        }
        call(ll,l,dp,s,0);
        return ll;
    }
    public void call(List<List<String>>ll,List<String>l,boolean[][]dp,String s,int i){
        if(s.length()==i){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(dp[i][j]){
                l.add(s.substring(i,j+1));
                call(ll,l,dp,s,j+1);
                l.remove(l.size()-1);
            }
        }
    }
}