class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==x){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}