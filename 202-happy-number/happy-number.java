class Solution {
    public boolean isHappy(int n) {
        Set<Integer>s=new HashSet<>();
        s.add(n);
        return check(n,s);
    }
    public boolean check(int n,Set<Integer>s){
        if(n==1) return true;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        if(s.contains(sum)){
            return false;
        }
        s.add(sum);
        return check(sum,s);
    }
}