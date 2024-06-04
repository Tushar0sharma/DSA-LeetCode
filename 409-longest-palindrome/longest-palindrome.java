class Solution {
    public int longestPalindrome(String s) {
        // Map<Character,Integer>mp=new HashMap<>();
        int []arr=new int[256];
        for(char ch:s.toCharArray()){
            // mp.put(ch,mp.getOrDefault(ch,0)+1);
            arr[ch-'0']++;
            System.out.println(ch-'0');
        }

        int one=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans+=arr[i];
                arr[i]=0;
            }
            else if(arr[i]%2!=0 && arr[i]!=1){
                ans+=arr[i]-1;
                arr[i]=1;
                if(one==0){
                    ans++;
                    one=1;
                }
            }
            else if(arr[i]==1 && one==0 ){
                one=1;
                ans++;
            }
        }
        return ans;
    }
}