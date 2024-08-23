class Solution {
    public String arrangeWords(String t) {
        String []text=t.split(" ");
        String [][]dp=new String[text.length][2];
        for(int i=0;i<text.length;i++){
            dp[i][0]=text[i];
            dp[i][1]=text[i].length()+"";
        }
        Arrays.sort(dp,(a,b)->Integer.parseInt(a[1])-Integer.parseInt(b[1]));
        String s="";
        for(int i=0;i<text.length;i++){
            s+=dp[i][0]+" ";
        }
        s=s.toLowerCase();
        String ans=Character.toUpperCase(s.charAt(0))+s.substring(1,s.length()-1);
        return ans;
    }
}