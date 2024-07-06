class Solution {
    public int passThePillow(int n, int time) {
        int pos=-1;
        for(int i=0;i<time;i++){
            if(pos==n) pos*=-1;
            if(pos==-1) pos*=-1;
            pos++;
        }
        return Math.abs(pos);
    }
}