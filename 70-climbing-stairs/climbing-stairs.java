class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer>mp=new HashMap<>();
        return f(n,mp);
    }
    public int f(int n,Map<Integer,Integer>mp){
        if(n==0 || n==1){
            return 1;
        }
        if(!mp.containsKey(n)){
            mp.put(n,f(n-2,mp)+f(n-1,mp));
        }
        return mp.get(n);
    }
}