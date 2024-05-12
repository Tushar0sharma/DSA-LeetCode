class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                s.push(a[i]);
            }
            else{
            while(!s.isEmpty() && s.peek()>0 && Math.abs(a[i])>s.peek()){
                s.pop();
            }
            if(s.isEmpty() || s.peek()<0){
                s.push(a[i]);
            }
            else if(s.peek()==Math.abs(a[i])){
                s.pop();
            }
            }
        }
        int[]ans=new int[s.size()];
        int k=s.size()-1;
        while(!s.isEmpty()){
            ans[k--]=s.pop();
        }
        return ans;
    }
}