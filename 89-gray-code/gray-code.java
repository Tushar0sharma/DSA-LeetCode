class Solution {
    public List<Integer> grayCode(int n) {
        boolean[] used=new boolean[1<<n];
        List<Integer>l=new ArrayList<>();
        l.add(0);
        used[0]=true;
        backtrack(used,n,l);
        return l;
    }
    public boolean backtrack(boolean[]used,int n,List<Integer>l){
        if(l.size()==1<<n){
            return true;
        }

        for(int i=0;i<n;i++){
            int next=(1<<i) ^ l.get(l.size()-1);
            if(used[next]) continue;
            used[next]=true;
            l.add(next);
            if(backtrack(used,n,l)) return true;
            used[next]=false;
            l.remove(l.size()-1);
        }
        return false;
    }
}