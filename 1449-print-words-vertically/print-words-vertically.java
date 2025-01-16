class Solution {
    public List<String> printVertically(String s) {
        List<String>l=new ArrayList<>();
        String[]str=s.split(" ");
        int max=0;
        for(String ss:str) max=Math.max(ss.length(),max);
        for(int i=0;i<max;i++){
            StringBuilder sb=new StringBuilder();
            int space=0;
            for(int j=0;j<str.length;j++){
                if(str[j].length()>i){
                    sb.append(str[j].charAt(i));
                    space=0;
                }
                else{
                    sb.append(" ");
                    space++;
                }
            }
            l.add(sb.toString().substring(0,sb.length()-space));
        }
        return l;
    }
}