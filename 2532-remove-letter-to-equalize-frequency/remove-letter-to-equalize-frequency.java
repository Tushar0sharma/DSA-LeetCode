class Solution {
    public boolean equalFrequency(String word) {
        int[]arr=new int[26];
        for(char ch:word.toCharArray()){
        arr[ch-97]++;
        }
        int cnt=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']--;
            if(equalcnt(arr)){
                return true;
            }
            arr[ch-'a']++;
        }
        return false;
    }
    public boolean equalcnt(int[]arr){
        int c=0;
        for(int i:arr){
            if(i==0) continue;
            else if(c==0) c=i;
            else if(c==i) continue;
            else return false;
        }
        return true;
    }
}