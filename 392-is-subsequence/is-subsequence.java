class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(s.length()==0) return true;
        char[]ch1=s.toCharArray();
        char[]ch2=t.toCharArray();
        while(i<ch1.length && j<ch2.length){
            if(ch1[i]==ch2[j]){
                i++;
            }
            j++;
            if(i==ch1.length){
               return true; 
            }
        }
        return false;
    }
}