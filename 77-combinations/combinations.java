class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>l=new ArrayList<>();
        List<List<Integer>>ll=new ArrayList<>();
        boolean []check=new boolean[n];
        print(k,n,ll,l,1,0,check);
        return ll;
    }
    public void print(int k,int n,List<List<Integer>>ll,List<Integer>l,int idx,int b,boolean []check){
       if(b==k){
           ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<=n;i++){
            if(check[i-1]==false){
                 check[i-1]=true;
                 b++;
                 l.add(i);
                 print(k,n,ll,l,i+1,b,check);
                  l.remove(l.size()-1);
                 check[i-1]=false;
                  b--;
            }
        }
    }
}