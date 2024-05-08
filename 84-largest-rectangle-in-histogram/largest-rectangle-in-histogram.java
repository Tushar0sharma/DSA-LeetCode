class Solution {
    public int largestRectangleArea(int[] arr) {
        int[]ans1=smallestleft(arr,arr.length);
        int[]ans2=smallestright(arr,arr.length);
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max((ans2[i]-ans1[i]-1)*arr[i],max);
        }
        return max;
    }
    public int[] smallestleft(int []arr,int n){
        Stack<Integer>s=new Stack<>();
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(i);
        }
        return ans;
    }
    
    public int[] smallestright(int []arr,int n){
        Stack<Integer>s=new Stack<>();
        int []ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=n;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(i);
        }
        return ans;
    }
}