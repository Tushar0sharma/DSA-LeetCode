class Solution {
    public int maxFrequency(int[] nums, int k) {
        int cntk=0;
        for(int i:nums) if(i==k) cntk++;
        int max=0;
        int ans=0;
        for(int i=1;i<=50;i++){
            // if(i==k) continue;
            int sum=0;
            for(int j:nums){
                if(j==i) sum++;
                 if(j==k) sum--;
                if(sum<0) sum=0;
                max=Math.max(max,sum);
            }
        }
        return cntk+max;
    }
}