class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(candidates);
        call(ll,l,candidates,target,0);
        return ll;
    }
    public void call(List<List<Integer>> ll, List<Integer>l,int []cand,int tar,int start){
        if(tar==0){
            ll.add(new ArrayList<>(l));
            return ;
        }
        if(tar<0) return;
        for(int i=start;i<cand.length;i++){
            if(i>start && cand[i]==cand[i-1]) continue;
            l.add(cand[i]);
            call(ll,l,cand,tar-cand[i],i+1);
            l.remove(l.size()-1);
        }
    }
}