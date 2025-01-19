class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        l.add(1);
        ll.add(l);
        for(int i=1;i<numRows;i++){
            List<Integer>curr=new ArrayList<>();
            List<Integer>prev=ll.get(i-1);
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            ll.add(new ArrayList<>(curr));
        }
        return ll;
    }
    // public int findncr(int n,int r){
    //     int res=1;
    //     for(int i=0;i<r;i++){
    //         res*=(n-i);
    //         res/=(i+1);
    //     }
    //     return res;
    // }
}