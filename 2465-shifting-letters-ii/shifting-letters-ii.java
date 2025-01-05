class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int []pre=new int[n+1];
        for(int i[]:shifts){
            if(i[2]==0){
                pre[i[0]]+=-1;
                pre[i[1]+1]+=1;
            }
            else{
                pre[i[0]]+=1;
                pre[i[1]+1]+=-1;
            }
        }
        for(int i=1;i<n;i++){
            pre[i]+=pre[i-1];
        }
        System.out.println(Arrays.toString(pre));
        int k=0;
        String ans="";
        for(char ch:s.toCharArray()){
            char nn = (char) (((ch - 'a' + pre[k++]) % 26 + 26) % 26 + 'a');
            ans+=nn;
        }        
        return ans;

    }
}