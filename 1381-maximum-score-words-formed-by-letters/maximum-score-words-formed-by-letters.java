class Solution {
    private int maxscore;
    private int[] freq; 
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int w=words.length;
        freq=new int[26];
        for(char ch:letters){
            freq[ch-'a']++;
        }
        maxscore=0;
        check(w-1,words,score,0,new int[26]);
        return maxscore;
    }
    public boolean isvalid(int []subsetletters){
        for(int i=0;i<26;i++){
            if(freq[i]<subsetletters[i]){
                return false;
            }
        }
        return true;
    }
    public void check(int w,String[]words,int []score,int totalscore,int[]subsetletters){
        if(w==-1){
            maxscore=Math.max(totalscore,maxscore);
            return ;
        }
        check(w-1,words,score,totalscore,subsetletters);
        int l=words[w].length();
        for(int i=0;i<l;i++){
            int c=words[w].charAt(i)-'a';
            subsetletters[c]++;
            totalscore+=score[c];
        }
        if(isvalid(subsetletters)){
            check(w-1,words,score,totalscore,subsetletters);
        }
        for(int i=0;i<l;i++){
            int c=words[w].charAt(i)-'a';
            subsetletters[c]--;
            totalscore-=score[c];
        }
    }
}