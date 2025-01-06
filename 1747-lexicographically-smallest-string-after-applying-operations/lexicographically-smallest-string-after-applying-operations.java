class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String>q=new LinkedList<>();
        Set<String>seen=new HashSet<>();
        q.add(s);
        String min=s;
        while(!q.isEmpty()){
            String p=q.poll();
            if(p.compareTo(min)<0) min=p;
            String rev=p.substring(p.length()-b)+p.substring(0,s.length()-b);
            if(seen.add(rev)) q.add(rev);
            char []ch=p.toCharArray();
            for(int i=1;i<s.length();i+=2){
                ch[i]=(char)((ch[i]-'0'+a)%10+'0');
            }
            String chh=new String(ch);
            if(seen.add(chh)) q.add(chh);
        }
        return min;
    }
}