class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(candidates);
        print(ll,l,candidates,target,0,0);
        return ll;
    }
    public void print(List<List<Integer>>ll,List<Integer>l,int []candidates,int target,int idx,int value){
        if(value==target){
            ll.add(new ArrayList(l));
            return;
        }
        if(value>target) return;
        for(int i=idx;i<candidates.length;i++){
            if(i>idx&&candidates[i]==candidates[i-1]
            ) continue;
            l.add(candidates[i]);
            print(ll,l,candidates,target,i+1,value+candidates[i]);
            l.remove(l.size()-1);
        }
    }
}