class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder s=new StringBuilder();

        int x=1;
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='D'){
                int dcount=0;
                while(i<pattern.length() && pattern.charAt(i)=='D'){
                    dcount++;
                    i++;
                }
                int temp=dcount;
                while(dcount>0){
                    s.append(x+dcount);
                    dcount--;
                }
                s.append(x);
                x+=temp;
            }
            else{
                s.append(x);
            }
            x++;
        }
        if(pattern.charAt(pattern.length()-1)=='I') s.append(x);
        return s.toString();
    }
}