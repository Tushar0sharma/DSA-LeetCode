class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=1;i<=n+1;i++){
            ll.add(generaterow(i));
        }
        return ll.get(ll.size()-1);
    }
    public List<Integer> generaterow(int i){
        long ans=1;
        List<Integer>l=new ArrayList<>();
        l.add(1);
        for(int j=1;j<i;j++){
            ans*=(i-j);
            ans/=j;
            l.add((int)ans);
        }
        return l;
    }
}