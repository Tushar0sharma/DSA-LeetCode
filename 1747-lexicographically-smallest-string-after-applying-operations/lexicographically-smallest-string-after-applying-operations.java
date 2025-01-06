class Solution {
    Set<String>seen=new HashSet<>();
    String min;
    public String findLexSmallestString(String s, int a, int b) {
        min=s;
        dfs(s,a,b);
        return min;
    }
    public void dfs(String s,int a,int b){
        if(seen.contains(s)) return;
        if(min.compareTo(s)>0) min=s;
        seen.add(s);
        String rev=s.substring(s.length()-b)+s.substring(0,s.length()-b);
        dfs(rev,a,b);
        char []ch=s.toCharArray();
        for(int i=1;i<s.length();i+=2){
            ch[i]=(char)((ch[i]-'0'+a)%10+'0');
        }
        dfs(new String(ch),a,b);
    }
}