class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int []mask=new int[n];

        for(int i=0;i<n;i++){
            for(char ch:words[i].toCharArray()){
                mask[i]|=(1<<(ch-'a'));
            }
        }
        for(int i:mask) System.out.print(i+" ");

        int longest=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((mask[i] & mask[j]) ==0)
                longest=Math.max(longest,(words[i].length()*words[j].length()));
            }
        }
        return longest;
    }
}