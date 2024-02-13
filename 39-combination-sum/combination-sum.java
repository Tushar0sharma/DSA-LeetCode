class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        print(ll,l,candidates,target,0,0);
        return ll;
        
    }
    public void  print( List<List<Integer>>ll,List<Integer>l,int[] candidates, int target,int value,int idx){
        if(value==target){
            ll.add(new ArrayList(l));
            return;
        }
        if(value>target) return;
        for(int i=idx;i<candidates.length;i++){
            l.add(candidates[i]);
            print(ll,l,candidates,target,value+candidates[i],i);
            l.remove(l.size()-1);
        }
    }
}