class Solution {
    public List<Integer> getRow(int n) {
        List<Integer>ll=new ArrayList<>();
        // for(int i=1;i<=n+1;i++){
        //     ll.add(generaterow(i));
        // }
        int [][]arr=new int[n+1][n+1];
        for(int i=0;i<=n;i++) arr[i][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }for (int i = 0; i <= n; i++) {
            ll.add(arr[n][i]);
        }
        return ll;
    }
    // public List<Integer> generaterow(int i){
    //     long ans=1;
    //     List<Integer>l=new ArrayList<>();
    //     l.add(1);
    //     for(int j=1;j<i;j++){
    //         ans*=(i-j);
    //         ans/=j;
    //         l.add((int)ans);
    //     }
    //     return l;
    // }
}