class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>ans=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(kmp(words[j],words[i]) && i!=j) {ans.add(words[i]);break;}
            }
        }
        return ans;
    }
    public boolean kmp(String str,String pat){
        int n=str.length();
        int m=pat.length();
        int i=0,j=0;
        int []lps=call(pat);
        while(i<n){
            if(pat.charAt(j)==str.charAt(i)){
                i++;
                j++;
                if(j==m) return true;
            }
            else{
                if(j>0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    public int[] call(String pat){
        int len=0;
        int n=pat.length();
        int[]lps=new int[n];
        int i=1;
        lps[0]=0;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len>0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}