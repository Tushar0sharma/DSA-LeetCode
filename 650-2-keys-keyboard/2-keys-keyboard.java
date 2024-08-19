class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        return 1+call(1,n,1);
    }
    public int call(int i,int n,int j){
        if(i==n) return 0;
        if(i>n) return 1000;
        return Math.min(2+call(i*2,n,i),1+call(i+j,n,j));
    }
}