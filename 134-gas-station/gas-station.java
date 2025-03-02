class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0) return -1;
        int start=0;
        int fuel=0;
        for(int i=0;i<n;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                start=i+1;
                fuel=0;
            }
        }
        return start;
    }
}