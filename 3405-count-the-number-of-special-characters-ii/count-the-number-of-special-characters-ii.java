class Solution {
    public int numberOfSpecialChars(String s) {
        int []used=new int[26];
        int []small=new int[26];
        int []big=new int[26];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                if(big[s.charAt(i)-'A']==0){
                    big[s.charAt(i)-'A']=i+1;
                }
            }else{
                small[s.charAt(i)-'a']=i+1;
            }
        }

        int ans=0;
        for(int i=0;i<26;i++){
            if(small[i]==0) continue;
            if(small[i]<big[i]) ans++;
        }

        return ans;
    }
}