class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int num=1;num<=n;num++){
            int sqr=num*num;
            if(part(String.valueOf(sqr),num,0)){
                // System.out.print(num+" ");
                sum+=sqr;
            }
        }
        return sum;
    }
    public boolean part(String s,int num,int sum){
        if(sum==num && s.length()==0){
            return true;
        }
        if(sum>num || s.length()==0) return false;
        for(int i=1;i<=s.length();i++){
            int a=Integer.parseInt(s.substring(0,i));
            if(part(s.substring(i),num,sum+a)) return true;
        }
        return false;
    }
}