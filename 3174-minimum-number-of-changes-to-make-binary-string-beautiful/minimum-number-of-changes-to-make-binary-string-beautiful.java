class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int i=0;
        int ans=0;

        while(i<n){
            int o=0;
            int z=0;
            if(s.charAt(i)=='0'){
                z++;
            }else{
                o++;
            }
            i++;
            if(s.charAt(i)=='0'){
                z++;
            }else{
                o++;
            }
            i++;
            if(o==z){
                ans++;
            }
        }
        return ans;
    }
}