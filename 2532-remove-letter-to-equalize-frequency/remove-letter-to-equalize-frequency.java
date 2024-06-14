class Solution {
    public boolean equalFrequency(String word) {
        int []cnt=new int[26];
        for(char ch:word.toCharArray()){
            cnt[ch-97]++;
        }

        for(char ch:word.toCharArray()){
            cnt[ch-97]--;
            if(equal(cnt)) return true;
            cnt[ch-97]++;
        }
        return false;
    }
    public boolean equal(int []cnt){
        int c=0;
        for(int i:cnt){
            if(i==0) continue;
            else if(c==0) c=i;
            else if(c==i) continue;
            else return false;
        }
        return true;
    }
}