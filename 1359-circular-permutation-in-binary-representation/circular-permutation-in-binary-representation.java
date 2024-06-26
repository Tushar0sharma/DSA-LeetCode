class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        boolean []used=new boolean[1<<n];
        used[0]=true;
        List<Integer>l=new ArrayList<>();
        l.add(0);
        call(l,used,n);
        List<Integer>res=new ArrayList<>();
        int idx=l.indexOf(start);
        for(int i=0;i<l.size();i++){
            res.add(l.get((idx+i)%l.size()));
        }
        return res;
    }
    public boolean call(List<Integer>l,boolean[]used,int n){
        if(l.size()==1<<n){
            return true;
        }
        for(int i=0;i<n;i++){
            int next=l.get(l.size()-1)^(1<<i);
            if(!used[next]){
                used[next]=true;
                l.add(next);
                if(call(l,used,n)) return true;
                used[next]=false;
                l.remove(l.size()-1);
            }
        }
        return false;
    }
}