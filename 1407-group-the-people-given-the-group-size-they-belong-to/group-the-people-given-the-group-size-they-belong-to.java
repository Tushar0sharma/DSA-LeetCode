class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>>mp=new HashMap<>();
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!mp.containsKey(groupSizes[i])){
                mp.put(groupSizes[i],new ArrayList<>());
            }
            List<Integer>l=mp.get(groupSizes[i]);
            l.add(i);
            if(l.size()==groupSizes[i]){
                ll.add(l);
                mp.remove(groupSizes[i]);
            }
        } 
        return ll;
    }
}