class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int freq=0,val=Integer.MAX_VALUE;
        for(int i:nums){ if(i%2==0){ 
            int curr=mp.getOrDefault(i,0)+1;
            mp.put(i,curr); 
            if(curr>freq || curr==freq && i<val){
                val=i;
                freq=curr;
            }
        }
}
        return freq==0?-1:val;
    }
}