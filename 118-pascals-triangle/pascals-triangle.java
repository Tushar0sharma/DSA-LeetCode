class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ll.add(generaterow(i));
        }
        return ll;
    }
    public List<Integer> generaterow(int i){
        List<Integer>l=new ArrayList<>();
        long ans=1;
        l.add(1);
        for(int j=1;j<i;j++){
            ans=ans*(i-j);
            ans=ans/j;
            l.add((int)ans);
        }
        return l;
    }
}