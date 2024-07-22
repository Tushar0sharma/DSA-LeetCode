class Solution {
    public int minimumLength(String s) {
        int []arr=new int[26];
        int a=0;
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch-'a']==3){
                a+=2;
                arr[ch-'a']=1;
            }
        }
        return s.length()-a;
    }
}