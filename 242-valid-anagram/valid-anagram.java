class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []arr1=new int[150];
        for(int i=0;i<s.length();i++){
            int x=(int)s.charAt(i);
            arr1[x]++;
        }
       int []arr2=new int[150];
        for(int i=0;i<t.length();i++){
             int x=(int)t.charAt(i);
             arr2[x]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}