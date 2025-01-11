class Solution {
    public List<String> removeComments(String[] source) {
        List<String>l=new ArrayList<>();
        boolean block=false;
        StringBuilder sb=new StringBuilder();
        for(String s:source){
            for(int i=0;i<s.length();i++){
                if(!block && i+1<s.length() && s.charAt(i)=='/' && s.charAt(i+1)=='/'){
                    break;
                }
                else if(!block && i+1<s.length() && s.charAt(i)=='/' && s.charAt(i+1)=='*'){
                    block=true;
                    i++;
                }
                else if(block && i+1<s.length() && s.charAt(i)=='*' && s.charAt(i+1)=='/'){
                    block=false;
                    i++;
                }
                else if(!block){
                    sb.append(s.charAt(i));
                }
            }
            if(sb.length()>0 && !block){
                l.add(sb.toString());
                sb.setLength(0);
            }
        }
        return l;
    }
}