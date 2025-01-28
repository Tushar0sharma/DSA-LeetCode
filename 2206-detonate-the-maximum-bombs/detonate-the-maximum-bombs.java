class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n=bombs.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,call(bombs,new boolean[n],i));
        }
        return ans;
    }
    public int call(int [][]bombs,boolean[]v,int src){
        v[src]=true;
        int ans=1;
        for(int i=0;i<bombs.length;i++){
            if(!v[i] && range(bombs[src],bombs[i])){
                ans+=call(bombs,v,i);
            }
        }
        return ans;
    }
    public boolean range(int []a,int []b){
        long aa=a[0]-b[0],bb=a[1]-b[1],r=a[2];
        return aa*aa+bb*bb <=r*r;
    }
}