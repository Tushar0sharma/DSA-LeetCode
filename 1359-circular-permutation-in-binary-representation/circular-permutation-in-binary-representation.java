class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            l.add(start^(i^(i>>1)));
        }
        return l;
    }
}