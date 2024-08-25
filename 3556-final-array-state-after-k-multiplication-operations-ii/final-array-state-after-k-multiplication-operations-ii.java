class Solution {
    int mod=(int)1e9+7;
    public int[] getFinalState(int[] nums, int k, int multi) {
        if(multi==1) return nums;
        int max=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int i:nums) max=Math.max(max,i);
        for(int i=0;i<nums.length;i++) pq.add(new int[]{nums[i],i});

        while(k>0 && (pq.peek()[0]*(long)multi)<=max){
            k--;
            pq.add(new int[]{(int)((pq.peek()[0]*(long)multi)%mod),pq.peek()[1]});
            pq.poll();
        }
        long ex=m(multi,k/nums.length);
        while(!pq.isEmpty()){
            int num=pq.peek()[0];
            int idx=pq.peek()[1];
            pq.poll();
            if(k%nums.length!=0){
                k--;
                nums[idx]=(int)(((ex*num)%mod *multi)%mod);
            }
            else{
                nums[idx]=(int)((ex*num)%mod);
            }
        }
        return nums;
    }
    public long m(int mul,int base){
        long res=1;
        long k=mul;
        while(base>0){
            if((base & 1)!=0){
                res*=k;
                res%=mod;
            }
            k=k*k;
            k%=mod;
            base>>=1;
        }
        return res;
    }
}