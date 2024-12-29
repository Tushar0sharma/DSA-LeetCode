class Solution {
    public String answerString(String word, int numFriends) {
        String ans="",curr="";
        if(numFriends==1) return word;
        int n=word.length()-numFriends+1;
        for(int i=0;i<word.length();i++){
            curr=word.substring(i,Math.min(word.length(),i+n));
            if(curr.compareTo(ans)>0){
                ans=curr;
            }
        }
        return ans;
    }
}