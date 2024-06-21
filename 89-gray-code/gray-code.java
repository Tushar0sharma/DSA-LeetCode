class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer>l=new ArrayList<>();
        boolean []used=new boolean[1<<n];
        l.add(0);
        used[0]=true;
        call(l,used,n);
        return l;
    }
    public boolean call(List<Integer>l,boolean[]used,int n){
        if(l.size()==1<<n){
            return true;
        }
        for(int i=0;i<n;i++){
            int next=l.get(l.size()-1)^(1<<i);
            if(used[next]) continue;
            used[next]=true;
            l.add(next);
            if(call(l,used,n)) return true;
            used[next]=false;
            l.remove(l.size()-1);
        }
        return false;
    }
}