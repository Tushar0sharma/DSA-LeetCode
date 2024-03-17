class Solution {
    public boolean isSubstringPresent(String s) {
       String s1=reverse(s);
       List<String>l=new ArrayList<>();
       for(int i=0;i<s.length()-1;i++){
        l.add(s.charAt(i)+""+s.charAt(i+1));
       }
       for(int i=0;i<l.size();i++){
          if(s.contains(l.get(i))&& s1.contains(l.get(i))){
            return true;
          }
       }
        return false;
    }
    public String reverse(String s){
        char[]ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String s2=new String(ch);
        return s2;
    }
}