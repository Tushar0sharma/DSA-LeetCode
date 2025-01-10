class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.equals(goal)){
            int []arr=new int[26];
            for(char ch:s.toCharArray()){
                arr[ch-'a']++;
                if(arr[ch-'a']>1) return true;
            }
            return false;
        }
        int a=-1;
        int b=-1;
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<s.length();i++){
            if(goal.charAt(i)!=s.charAt(i)){
                if(a==-1) a=i;
                else if(b==-1) b=i;
                else return false;
            }
        }
        return b!=-1 && s.charAt(a)==goal.charAt(b) && s.charAt(b)==goal.charAt(a);
    }
}