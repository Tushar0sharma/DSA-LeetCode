class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%3!=0) return false;
        int k=sum/3;
        sum=0;
        int c=0;
        for(int i:arr){
            sum+=i;
            if(sum==k) {
                c++;
                sum=0;
            }
        }
        return c>=3 ;
    }
}