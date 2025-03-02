class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i-1]<ratings[i]){
                ans[i]=ans[i-1]+1;
            }
            else ans[i]=1;
        }
        System.out.println(Arrays.toString(ans));
        for(int i=n-2;i>=0;i--){
            if(ratings[i+1]<ratings[i]){
                ans[i]=Math.max(ans[i],ans[i+1]+1);
            }
            else ans[i]=Math.max(ans[i],1);
        }
        int sum=0;
        for(int i:ans) sum+=i;
        return sum;
    }
}