class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[]ans=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            int j=i+1;
            while(j<temperatures.length && temperatures[j]<=temperatures[i]){
                if(ans[j]>0){
                    j+=ans[j];
                }
                else{
                    j=temperatures.length;
                }
            }
            if(j<temperatures.length){
                ans[i]=j-i;
            }
        }
        return ans;
    }
}