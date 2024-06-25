class Solution {
    public int countArrangement(int n) {
        if(n==0) return 0;
        return call(1,n,new int[n+1]);
    }
    public int call(int pos,int n,int []used){
        if(pos>n){
            return 1;
        }
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(used[i]==0 && (i % pos == 0 || pos % i == 0)){
                used[i]=1;
                cnt+=call(pos+1,n,used);
                used[i]=0;
            }
        }
        return cnt;
    }
}