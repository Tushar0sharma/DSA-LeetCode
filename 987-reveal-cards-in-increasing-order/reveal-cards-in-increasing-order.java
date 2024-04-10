class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        int[]ans=new int[n];
        int idx1=0;
        int idx2=0;
        boolean skip=true;
        while(idx1<n){
            if(ans[idx2]==0){
                if(skip){
                    ans[idx2]=deck[idx1];
                    idx1++;             
                }
                skip=!skip;
            }
            idx2=(idx2+1)%n;
        }
        return ans;
    }
}