class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int []ans=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            ans[i]=call(potions,success,spells[i]);
        }
        return ans;
    }
    public int call(int []potion,long s,int k){
        int i=0;
        int j=potion.length-1;
        int ans=potion.length;
        while(i<=j){
            int mid=(i+j)/2;
            if((long)k*potion[mid]>=s){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        // System.out.println(ans);
        return potion.length-ans;
    }
}