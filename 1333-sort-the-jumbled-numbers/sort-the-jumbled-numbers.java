class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int map=0;
            int temp=nums[i];
            int place=1;
            
            if(temp==0){
                 l.add(new int[]{mapping[0],i});
                continue;
            }
            while(temp!=0){
                map=place*mapping[temp%10]+map;
                place*=10;
                temp/=10;
            }
            l.add(new int[]{map,i});
        }
        Collections.sort(l,(a,b)->a[0]-b[0]);
        
        int []ans=new int[nums.length];
        for(int i=0;i<l.size();i++){
            ans[i]=nums[l.get(i)[1]];
        }
        return ans;
    }
}