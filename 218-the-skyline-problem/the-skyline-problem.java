class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]>flat=new ArrayList<>();
        for(int []i:buildings){
            flat.add(new int[]{i[0],-i[2]});
            flat.add(new int[]{i[1],i[2]});
        }
        Collections.sort(flat,(a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        List<List<Integer>> ans=new ArrayList<>();
        for(int []i:flat)
        System.out.println(Arrays.toString(i));
        int prevmax=0;
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        mp.put(0,1);
        for(int []i:flat){
            if(i[1]<0){
                mp.put(-i[1],mp.getOrDefault(-i[1],0)+1);
            }
            else{
                mp.put(i[1],mp.getOrDefault(i[1],0)-1);
                if(mp.get(i[1])==0) mp.remove(i[1]);
            }
            int lastmax=mp.lastKey();
            if(prevmax!=lastmax){
                ans.add(Arrays.asList(i[0],lastmax));
                prevmax=lastmax;
            }
        }
        return ans;
    }
}