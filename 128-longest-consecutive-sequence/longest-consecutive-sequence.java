class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer>mp=new HashSet<>();
        int longest=1;
        for(int i=0;i<nums.length;i++){
            mp.add(nums[i]);
        }
        for(int i:mp){
            if(!mp.contains(i-1)){
               int x=i;
               int cnt=1;
               while(mp.contains(x+1)){
                   cnt+=1;
                   x+=1;
               }
               longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}