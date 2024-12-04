class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int k=0;        
        for(int i=0;i<str2.length();i++){
            boolean flag=true;
            for(int j=k;j<str1.length();j++){
                if(str1.charAt(j)==str2.charAt(i)  || ((str1.charAt(j)-'a')+1)%26==(str2.charAt(i)-'a')){
                    flag=false;
                    k=j+1;
                    break;
                }
            }
            if(flag){ return false;
            }
        }
        return true;
    }
}