class Solution {
    public String longestPalindrome(String s) {
     //Dynamic Programming
     int l=0;
     int r=0;
     int max=1;
     boolean[][]path=new boolean[s.length()][s.length()];
     for(int i=0;i<s.length();i++){
        path[i][i]=true;
        for(int j=0;j<i;j++){
            if(s.charAt(i)==s.charAt(j) && (i-j<=2 || path[j+1][i-1])){
                path[j][i]=true;
                if((i-j+1) >max){
                    max=i-j+1;
                    l=j;
                    r=i;
                }
            }
        }
     }   
     return s.substring(l,r+1);
    }
}