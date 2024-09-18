class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int tot=0;
        int pos=-1;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            curr+=diff;
            tot+=diff;
            if(curr<0){
                curr=0;
                pos=i;
            }
        }
        if(tot>=0) return pos+1;
        return -1;
    }
}