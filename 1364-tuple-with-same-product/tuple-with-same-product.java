class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=nums[i]*nums[j];
                if(mp.containsKey(a)){
                    cnt+=mp.get(a)*8;
                }
                mp.put(a,mp.getOrDefault(a,0)+1);
            }
        }
        return cnt;        
    }
}