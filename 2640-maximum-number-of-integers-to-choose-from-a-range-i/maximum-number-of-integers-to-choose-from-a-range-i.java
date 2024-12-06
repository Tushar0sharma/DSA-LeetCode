class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer>s=new HashSet<>();
        for(int i:banned) s.add(i);
        int sum=0;
        int cnt=0;
        int i=1;
        while(i<=n && sum+i<=maxSum){
            if(s.contains(i)){
                i++;
                continue;
            }
            // System.out.println(i);
            cnt++;
            sum+=i;
            i++;
        }
        return cnt;
    }
}