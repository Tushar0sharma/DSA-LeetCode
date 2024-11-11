class Solution {
    boolean []prime=new boolean[1001];
    public void seive(){
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i*i<=1000;i++){
            if(prime[i]){
                for(int j=i*i;j<=1000;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public boolean primeSubOperation(int[] nums) {
        seive();
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]) continue;

            for(int j=0;j<nums[i];j++){
                if(prime[j]){
                    if(nums[i]-j<nums[i+1]){
                        nums[i]=nums[i]-j;
                        break;
                    }
                }
            }
            if(nums[i]>=nums[i+1]) return false;
        }
        return true;
    }

}