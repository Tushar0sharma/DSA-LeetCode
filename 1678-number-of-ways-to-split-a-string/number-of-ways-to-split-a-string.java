class Solution {
    public int numWays(String s) {
        int mod=(int)1e9+7;
        long one=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') one++;
        }
        if(one%3!=0) return 0;
        long n=s.length();
        System.out.println(one);
        if(one==0)  return (int)((((n-1)*(n-2))/2)%mod);
        long part1=0, part2=0;
        long a=one/3;
        one=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') one++;
            if(one == a) part1++;
            else if(one==a*2) part2++;
        } 
        return (int)((part1*part2)%mod);
    }
}