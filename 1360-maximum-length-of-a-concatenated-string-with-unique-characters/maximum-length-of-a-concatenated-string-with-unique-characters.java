class Solution {
    int max=0;
    public int maxLength(List<String> arr) {
        call("",arr,0);
        return max;
    }
    public void call(String ans,List<String> arr,int i){
        if(i==arr.size()){
            if(check(ans)){
                max=Math.max(max,ans.length());
            }
            return;
        }
        call(ans+arr.get(i),arr,i+1);
        call(ans,arr,i+1);
    }
    public boolean check(String s){
        int []cnt=new int[26];
        for(char ch:s.toCharArray()){
            cnt[ch-'a']++;
            if(cnt[ch-'a']==2) return false;
        }
        return true;
    }
}