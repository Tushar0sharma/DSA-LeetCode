class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int []pre=new int[n];
        if(vowel(words[0].charAt(0)) && vowel(words[0].charAt(words[0].length()-1))){
            pre[0]=1;
        }
        for(int i=1;i<n;i++){
            int a=vowel(words[i].charAt(0)) && vowel(words[i].charAt(words[i].length()-1)) ? 1 : 0;
            pre[i]=pre[i-1]+a;
        }
        System.out.println(Arrays.toString(pre));
        int k=0;
        int []ans=new int[queries.length];
        for(int []i:queries){
            int a=i[0];
            int b=i[1];
            if(a==0) ans[k++]=pre[b];
            else ans[k++]=pre[b]-pre[a-1];
        }
        return ans;
    }
    public boolean vowel(char s){
        String str="aeiou";
        boolean a= (str.indexOf(s)!=-1)?true:false;
        return a;
    }
}