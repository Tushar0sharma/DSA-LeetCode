class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int []ans=new int[n];
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                s.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j:s){
                cnt+=Math.abs(j-i);
            }
            ans[i]=cnt;
        }
        return ans;
    }
}