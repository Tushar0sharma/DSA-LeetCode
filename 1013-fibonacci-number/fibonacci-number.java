class Solution {
    public int fib(int n) {
        int curr=0;
        int prevs=0;
        int prev=1;
        if(n<=1) return n;
        for(int i=2;i<=n;i++){
            curr=prev+prevs;
            prevs=prev;
            prev=curr;
        }
        return curr;
    }
}