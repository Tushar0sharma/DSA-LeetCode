class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int unrealizedcust=0;
        for(int i=0;i<minutes;i++){
            unrealizedcust+=customers[i]*grumpy[i];
        }
        int max=unrealizedcust;
        for(int i=minutes;i<n;i++){
            unrealizedcust+=customers[i]*grumpy[i];
            unrealizedcust-=customers[i-minutes]*grumpy[i-minutes];
            max=Math.max(unrealizedcust,max);
        }
        for(int i=0;i<n;i++){
            max+=customers[i]*(1-grumpy[i]);
        }
        return max;
    }
}