class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer>l=new ArrayList<>();
        call(l,num);
        return l;
    }
    public boolean call(List<Integer>l,String s){
        if(s.length()==0){
            return l.size()>=3;
        }
        for(int i=1;i<=s.length();i++){
            if(s.charAt(0)=='0' && i>1) break;
            long num=Long.parseLong(s.substring(0,i));
            if(num>Integer.MAX_VALUE){
                break;
            }
            int size=l.size();
            if(size>=2 && l.get(size-2)+l.get(size-1)<num) break;
            if(size<=1 || l.get(size-2)+l.get(size-1)==num){
                l.add((int)num);
                if(call(l,s.substring(i))) return true;
                l.remove(l.size()-1);
            }
        }
        return false;
    }
}