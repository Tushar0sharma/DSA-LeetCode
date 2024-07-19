class Solution {
    public int partitionString(String s) {
        int p=0;
        int []arr=new int[26];
        int l=0;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']>=l){
                p++;
                l=i+1;
            }
            arr[s.charAt(i)-'a']=i+1;
        }
        return p;
    }
}