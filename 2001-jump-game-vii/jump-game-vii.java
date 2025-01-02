class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer>q=new LinkedList<>();
        int currmax=0;
        if(s.charAt(0)=='0') q.add(0);
        while(!q.isEmpty()){
            int a=q.poll();
            if(a==s.length()-1) return true;
            int len=Math.min(a+maxJump,s.length()-1);
            int b=Math.max(a+minJump,currmax);
            for(int i=b;i<=len;i++)
            {
                if(s.charAt(i)=='0')
                q.add(i);
            }
            currmax=Math.min(s.length()-1,a+maxJump+1);
        }
        return false;
    }
}