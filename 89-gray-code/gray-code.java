class Solution {
    public List<Integer> grayCode(int n) {
        boolean []used=new boolean[1<<n];
        List<Integer>l=new ArrayList<>();
        l.add(0);
        used[0]=true;
        backtrack(used,l,n);
        // System.out.println(1<<1);
        return l;
    }
    public boolean backtrack(boolean []used,List<Integer>l,int n){
        if(l.size()== 1<<n){
            return true;
        }

        for(int i=0;i<n;i++){
            int nex=(1<<i) ^ l.get(l.size()-1);
            if(used[nex]) continue;
            used[nex]=true;
            l.add(nex);
            if(backtrack(used,l,n)) return true;
            used[nex]=false;
            l.remove(l.size()-1);
        }
        return false;
    }

}