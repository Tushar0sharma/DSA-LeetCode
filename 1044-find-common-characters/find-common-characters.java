class Solution {
    public List<String> commonChars(String[] words) {
        List<String>l=new ArrayList<>();
        int []curr=new int[26];
        int []comm=new int[26];
        for(int i=0;i<words[0].length();i++){
            comm[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++){
            Arrays.fill(curr,0);
            for(char ch:words[i].toCharArray()){
                curr[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                comm[j]=Math.min(comm[j],curr[j]);
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<comm[i];j++)
            l.add(String.valueOf((char)(i+'a')));
        }
        return l;
    }
}