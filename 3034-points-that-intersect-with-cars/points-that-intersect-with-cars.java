class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int []l=new int[103];
        for(List<Integer>i:nums){
            l[i.get(0)]++;
            l[i.get(1)+1]--;
        }
        int ans=0,d=0;
        for(int i:l){
            ans+=i;
            if(ans>0) d++;
        }
        return d;
    }
}