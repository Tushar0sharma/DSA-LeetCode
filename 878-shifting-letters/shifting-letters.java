class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        int []pre=new int[n+1];
        pre[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--){
            pre[i]=(shifts[i]+pre[i+1])%26;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append((char)((s.charAt(i)-'a'+pre[i])%26+'a'));
        }
        return sb.toString();
    }
}