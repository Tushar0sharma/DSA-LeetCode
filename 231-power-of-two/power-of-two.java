class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==0) return false;
        // while(n%2==0){
        //   n=n/2;
        // }
        //  return n==1;
        // return n>0 && (n&(n-1)) ==0;
        int ans =1;
        if(n==1) return true;
        for(int i=0;i<=30;i++){
            if(ans==n) return true;
            if(ans<Integer.MAX_VALUE&&ans>Integer.MIN_VALUE)
            ans=ans*2;
        }
        return false;
    }
}