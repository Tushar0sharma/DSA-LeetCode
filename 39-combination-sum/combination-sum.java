class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        call(candidates,target,ll,l,0,0);
        return ll;
    }
    public void call(int[] c, int t,List<List<Integer>>ll,List<Integer>l,int idx,int sum){
        if(sum==t){
            ll.add(new ArrayList<>(l));
            return ;
        }
        if(sum>t) return ;
        for(int i=idx;i<c.length;i++){
            l.add(c[i]);
            call(c,t,ll,l,i,sum+c[i]);
            l.remove(l.size()-1);
        }
        return;
    }
}