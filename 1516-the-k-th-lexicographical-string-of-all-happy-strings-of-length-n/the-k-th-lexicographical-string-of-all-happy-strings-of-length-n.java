class Solution {
    List<String>l=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public String getHappyString(int n, int k) {
        call(n,' ');
        Collections.sort(l);
        if(l.size()<k) return "";
        else return l.get(k-1);
    }
    public void call(int n,char prev){
        if(sb.length()==n){
            l.add(sb.toString());
            return;
        }
        for(char ch='a';ch<='c';ch++){
            if(ch!=prev){
                int len=sb.length();
                sb.append(ch);
                call(n,ch);
                sb.setLength(len);
            }
        }
        return;
    }
}