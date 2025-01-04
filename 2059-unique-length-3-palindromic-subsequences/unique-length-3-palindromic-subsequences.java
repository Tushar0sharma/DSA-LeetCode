class Solution {
    public int countPalindromicSubsequence(String s) {
        List<Integer>[]l=new ArrayList[26];
        int n=s.length();
        for(int i=0;i<26;i++) l[i]=new ArrayList<>();
        for(int i=0;i<n;i++){
            l[s.charAt(i)-'a'].add(i);
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if (l[i].size() > 1){
            int first=l[i].get(0);
            int last=l[i].get(l[i].size()-1);
            cnt+=call(first,last,(char)(i+'a'),s);
            }
        }
        return cnt;
    }
    public int call(int f,int l,char a,String k){
        Set<Character>s=new HashSet<>();
        // System.out.println(a);
        for(int i=f+1;i<l;i++){
            s.add(k.charAt(i));
        }
        return s.size();
    }
}