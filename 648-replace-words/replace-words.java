class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[]word=sentence.split(" ");
        Set<String>dict=new HashSet<>(dictionary);
        for(int i=0;i<word.length;i++){
            word[i]=shortest(word[i],dict);
        }
        return String.join(" ",word);
    }
    public String shortest(String word,Set<String>dict){
        for(int i=1;i<=word.length();i++){
            String root=word.substring(0,i);
            if(dict.contains(root)){
                return root;
            }
        }
        return word;
    }
}