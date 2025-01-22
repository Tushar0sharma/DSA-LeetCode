class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<=n;i++) l.add(i);
        return call(l,n,k,0);
    }
    public int call(List<Integer>l,int n,int k,int i){
        if(l.size()==1) return l.get(0);
        i=(i+k-1)%l.size();
        l.remove(i);
        return call(l,n,k,i);
    }
}