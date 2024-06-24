class Solution {
    public boolean isAdditiveNumber(String num) {
        if(num.length()<3) return false;
        List<Long>l=new ArrayList<>();        
        boolean c= call(num,l);
        return c;
    }
    public boolean call(String num,List<Long>l){
        if(num.length()==0) {
            System.out.println(l);
            if (l.size() >= 3) return true;
            else return false;
        }
        for(int i=1;i<=num.length();i++){
            if(num.charAt(0)=='0' && i>1) break;
            long k;
            try{
                 k=Long.parseLong(num.substring(0,i));
            }catch(NumberFormatException e){
                return false;
            }
            if(l.size()>=2 && l.get(l.size()-2)+l.get(l.size()-1)!=k) continue;
                l.add(k);
                if(call(num.substring(i),l)) return true;
                l.remove(l.size()-1);
        }
        return false;
    }
}