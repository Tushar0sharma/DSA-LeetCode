class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int []bit=new int[32];
        int l=0;
        for(int i=0;i<n;i++){
            update(bit,nums[i],true);
            while(check(bit,k) && l<=i){
                min=Math.min(i-l+1,min);
                update(bit,nums[l],false);
                l++;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public boolean check(int []bit,int k){
        int num=0;
        for(int i=0;i<32;i++){
            int b=(bit[i]>0)?1:0;
            num+=b*Math.pow(2,i);
        }
        return num>=k;
    }
    public void update(int []bit,int num,boolean b){
        for(int i=0;i<32;i++){
            if(num<=0) break;
            int k=((b)?1:-1)*(num%2);
            bit[i]=bit[i]+k;
            num/=2;
        }
    } 
}