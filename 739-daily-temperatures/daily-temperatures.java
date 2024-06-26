class Solution {
    public int[] dailyTemperatures(int[] t) {
        int []ans=new int[t.length];
        Stack<Integer>s=new Stack<>();
        for(int i=t.length-1;i>=0;i--){
            while(!s.isEmpty() && t[s.peek()]<=t[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i]=0;
            else{
                ans[i]=s.peek()-i;
            }
            s.push(i);
        }
        return ans;
    }
}