class Solution {
    public int[] diStringMatch(String s) {
        int []ans=new int[s.length()+1];
        int x=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                ans[a++]=x;
            }else{
                int dcnt=0;
                while(i<s.length() && s.charAt(i)=='D'){
                    dcnt++;
                    i++;
                }
                int t=dcnt;
                while(dcnt>0){
                    ans[a++]=x+dcnt;
                    dcnt--;
                }
                ans[a++]=x;
                x+=t;
            }
            x++;
        }
        if(s.charAt(s.length()-1)=='I') ans[a++]=x;
        return ans;
    }
}