class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int c=0;
        int i=happiness.length-1;
        // for(int i=0;i<happiness.length;i++){
        //     sum+=Math.max(0,happiness[i]-c);
        //     c++;
        //     if(c>=k){
        //         break;
        //     }
        // }
        while(k>0){
            if(happiness[i]-c<0){
                return sum;
            }
            sum+=(long )happiness[i]-c;
            k--;
            c++;
            i--;
        }
        return sum;
    }
}