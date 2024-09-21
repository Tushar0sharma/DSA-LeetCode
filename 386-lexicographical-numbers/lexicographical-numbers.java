class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>l=new ArrayList<>();
        return call(0,n,l);
    }
    public List<Integer> call(int cnt,int n,List<Integer>l){
        if(cnt>n) return l;
        int i=0;
        if(cnt==0){
            i=1;
        }
        else{
            l.add(cnt);
        }
        for(;i<10;i++){
            call(cnt*10+i,n,l);
        }
        return l;
    }
}