class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(k==0) ans[i]=0;
            else if(k>0){
                int sum=0;
                for(int j=i+1;j<=i+k;j++){
                    sum+=code[(j)%(n)];
                }
                ans[i]=sum;
            }
            else if(k<0){
                int sum = 0;
                for (int j = i - 1; j >= i + k; j--) {
                    sum += code[(j + n) % n]; 
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}