class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<1<<n;i++){
            int a=i^i>>1;
            l.add(a);
        }
        return l;
    }
}