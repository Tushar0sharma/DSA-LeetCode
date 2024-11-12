class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(a,b)->a[0]-b[0]);
        int n=items.length;
        int max=0;
        for(int i=0;i<items.length;i++){
            int ele=items[i][1];
            max=Math.max(ele,max);
            items[i][1]=max;
        }
        for(int []i:items){
            for(int j:i) System.out.print(j+" ");
            System.out.println();
        }
        int []ans=new int[queries.length];
        int d=0;
        for(int key:queries){
            int l=0;
            int r=n-1;
            int cnt=0;
            while(l<=r){
                int mid=(l+r)/2;
                if(key>=items[mid][0]){
                    cnt=mid+1;
                    l=mid+1;
                }
                else r=mid-1;
            }
            if(cnt==0)  ans[d++]=0;
            else ans[d++]=items[cnt-1][1];
        }
        return ans;
    }
}