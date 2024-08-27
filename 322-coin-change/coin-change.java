class Solution {
    public int coinChange(int[] arr, int tar) {
        int n=arr.length;
        int []prev=new int[tar+1];
        prev[0]=0;
        for(int i=1;i<=tar;i++){
            if(i%arr[0]==0) prev[i]=i/arr[0];
            else prev[i]=(int )1e9;
        }
        for(int i=1;i<n;i++){
            int []c=new int[tar+1];
            for(int j=0;j<=tar;j++){
                int nottake=prev[j];
                int take=(int)1e9;
                if(j>=arr[i]) take=1+c[j-arr[i]];
                c[j]=Math.min(take,nottake);
            }
            prev=c;
        }
        return prev[tar]==(int)1e9?-1:prev[tar];
    }
}