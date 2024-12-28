class Solution {
    public int[] diStringMatch(String s) {
        int []ans=new int[s.length()+1];
        int a=0;
        int x=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') ans[i]=a++;
            else ans[i]=x--;
        }
        ans[s.length()]=x;
        return ans;
    }
}