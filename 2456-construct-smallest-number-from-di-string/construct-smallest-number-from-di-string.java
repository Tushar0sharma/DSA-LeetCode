class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder s=new StringBuilder();
        StringBuilder stack=new StringBuilder();
        for(int i=0;i<=pattern.length();i++){
            stack.append((char)('1'+i));
            if(pattern.length()==i || pattern.charAt(i)=='I'){
                s.append(stack.reverse());
                stack=new StringBuilder();
            }
        }
        return s.toString();
    }
}