class Solution {
    public String nearestPalindromic(String n) {
        int len=n.length();
        boolean even=(len%2==0);
        int l=(len%2==0)?len/2:len/2+1;
        long firstval=Long.parseLong(n.substring(0,l));
        List<Long>list=new ArrayList<>();
        list.add(util(firstval,even));
        list.add(util(firstval-1,even));
        list.add(util(firstval+1,even));
        list.add((long)Math.pow(10,len-1)-1);
        list.add((long)Math.pow(10,len)+1);
        long diff=Long.MAX_VALUE,res=0,num=Long.valueOf(n);
        for(long v:list){
            if(v==num) continue;
            if(Math.abs(v-num)<diff){
                diff=Math.abs(v-num);
                res=v;
            }
            else if(Math.abs(v-num)==diff){
                res=res<v?res:v;
            }
        }
        return String.valueOf(res);
    }
    public long util(long f,boolean even){
        long res=f;
        if(!even) f=f/10;

        while(f>0){
            res=res*10+(f%10);
            f/=10;
        }
        return res;
    }
}