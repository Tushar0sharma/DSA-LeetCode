class Solution {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            if(call(String.valueOf(i*i),i,0)){
                ans+=i*i;
            }
        }
        return ans;
    }
    public boolean call(String n,int num,int sum){
        if(sum==num && n.length()==0 ) return true;
        if(sum>num ||n.length()==0) return false;
        for(int i=1;i<=n.length();i++){
            int left=Integer.parseInt(n.substring(0,i));
            if(call(n.substring(i),num,sum+left)) return true;
        }
        return false;
    }
}