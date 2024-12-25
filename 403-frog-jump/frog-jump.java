class Solution {
    Map<Integer,Integer>mp=new HashMap<>();
    Boolean [][]dp;
    public boolean canCross(int[] stones) {
        int n=stones.length;
        if(stones[1]!=1) return false;
        dp=new Boolean[n][n];
        for(int i=0;i<n;i++) mp.put(stones[i],i);
        return call(1,1,stones);
    }
    public boolean call(int i,int jmp,int []stones){
        if(i>=stones.length) return false;
        if(i==stones.length-1) return true;

        if(dp[i][jmp]!=null) return dp[i][jmp];
        boolean ans=false;
        if(mp.containsKey(stones[i]+jmp)){
            ans=ans||call(mp.get(stones[i]+jmp),jmp,stones);
        }
        if(mp.containsKey(stones[i]+jmp+1)){
            ans=ans||call(mp.get(stones[i]+jmp+1),jmp+1,stones);
        }
        if(jmp>1&& mp.containsKey(stones[i]+jmp-1)){
            ans=ans||call(mp.get(stones[i]+jmp-1),jmp-1,stones);
        }
        return dp[i][jmp]=ans;
    }
}