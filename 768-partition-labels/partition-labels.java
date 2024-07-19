class Solution {
    public List<Integer> partitionLabels(String s) {
        int a=0;
        int l[]=new int[26];
        List<Integer>ll=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            l[s.charAt(i)-'a']=i;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            j=Math.max(j,l[s.charAt(i)-'a']);
            if(i==j){
                ll.add(i-a+1);
                a=i+1;
            }
        }
        return ll;
    }
}