class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String>mp=new TreeMap<>();
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }
        String[]ans=new String[names.length];
        int k=names.length-1;
        for(String s:mp.values()){
            ans[k--]=s;
        }
        return ans;
    }
}