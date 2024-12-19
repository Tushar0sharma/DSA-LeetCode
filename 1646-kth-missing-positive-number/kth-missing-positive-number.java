class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer>s=new HashSet<>();
        for(int i:arr) s.add(i);
        int i=0;
        int cnt=0;
        while(i>=0){
            i++;
            if(!s.contains(i)) cnt++;
            if(cnt==k) return i;
        }
        return 0;
    }
}