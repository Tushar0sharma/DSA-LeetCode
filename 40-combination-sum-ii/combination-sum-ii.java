class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        Arrays.sort(c);
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        call(ll,l,c,target,0,0);
        return ll;
    }
    public void call(List<List<Integer>>ll,List<Integer>l,int []c,int t,int sum,int idx){
        if(sum==t){
            ll.add(new ArrayList<>(l));
            return;
        }
        if(sum>t) return ;
        for(int i=idx;i<c.length;i++){
            if(i>idx && c[i]==c[i-1]) continue;
            l.add(c[i]);
            call(ll,l,c,t,sum+c[i],i+1);
            l.remove(l.size()-1);
        }
        return;
    }
}