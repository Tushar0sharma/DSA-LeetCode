class Solution {
    public int numberOfSubstrings(String s) {
        int a=0;
        int b=0,ans=0;
        int c=0;
        int n=s.length();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')a++;
            else if(s.charAt(i)=='b')b++;
            else c++;
            while(a>0 && b>0 && c>0){
                if(s.charAt(j)=='a')a--;
                else if(s.charAt(j)=='b')b--;
                else c--;
                ans+=n-i;
                j++;
            }
        }
        return ans;
    }
}