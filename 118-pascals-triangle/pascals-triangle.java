class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer>l=new ArrayList<>();
            for(int j=1;j<=i;j++){
                l.add(findncr(i-1,j-1));
            }
            ll.add(new ArrayList<>(l));
        }
        return ll;
    }
    public int findncr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
}