class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        
        int []l=new int[n];
        int []r=new int[n];
        
        Arrays.fill(l,-1);
        Arrays.fill(r,n);
        
        Deque<Integer>s=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(!s.isEmpty()) l[i]=s.peek();
            s.push(i);
        }
        s.clear();

        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]) s.pop();
            if(!s.isEmpty()) r[i]=s.peek();
            s.push(i);
        }

        int m=(int)1e9+7;
        long ans=0;

        for(int i=0;i<n;i++){
            ans+=(long) (i-l[i])*(r[i]-i)%m*arr[i]%m;
            ans%=m;
        }
        return (int)ans;
    }
}