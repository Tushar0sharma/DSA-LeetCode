class Solution {
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        int[]bit=new int[n];
        int u=0;
        for(int i:nums) bit[u++]=Integer.bitCount(i);
        u=0;
        List<List<Integer>>ll=new ArrayList<>();
        int prev=-1;
        for(int i=0;i<n;i++){
            if(prev==-1){
                if(!ll.contains(u)) ll.add(new ArrayList<>());
                ll.get(u).add(nums[i]);
                prev=bit[i];
            }
            else if(prev==bit[i]){
                ll.get(u).add(nums[i]);
            }
            else{
                u++;
                if(!ll.contains(u)) ll.add(new ArrayList<>());
                ll.get(u).add(nums[i]);
                prev=bit[i];
            }
        }
        int max=-1;
        for(List<Integer>l:ll){
            int min=Integer.MAX_VALUE;
            int c=-1;
            for(int i:l){
                c=Math.max(c,i);
                min=Math.min(min,i);
            }
            if(min<max) return false;
            max=c;
        }
        return true;
    }
}