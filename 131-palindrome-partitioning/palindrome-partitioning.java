class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ll=new ArrayList<>();
        List<String>l=new ArrayList<>();
        partition(s,ll,l);
        return ll;
    }
    public void partition(String s,List<List<String>>ll,List<String>l){
        if(s.length()==0){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<s.length();i++){
            String k=s.substring(0,i+1);
            if(check(k)){
                l.add(k);
                partition(s.substring(i+1),ll,l);
                l.remove(l.size()-1);
            }
        }

    }
    public boolean check(String s1){
       int i=0;
       int j=s1.length()-1;
       while(i<j){
           if(s1.charAt(i)!=s1.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
}