class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        return print(n,0,ans);        
    }
    static List<Integer> print(int n,int cnt,List<Integer>ans){
        if(cnt>n) return ans;
        int i=0;
        if(cnt==0){
            i=1;
        }
        else{
            ans.add(cnt);
        }
        for(;i<=9;i++){
            print(n,cnt*10+i,ans);
        }
        return ans;
    } 
}