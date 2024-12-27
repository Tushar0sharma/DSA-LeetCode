class Solution {
    public String convert(String s, int num) {
        if (num == 1)
            return s;
        String ans="";
        int n=s.length();
        char [][]arr=new char[num][n];
        int idx=0;
        int i=0;
        int j=0;
        boolean down=true;
        while(idx<n){
            if(down){
                arr[i][j]=s.charAt(idx);
                if(i==num-1){
                    down=false;
                    i--;
                    j++;
                }
                else{
                    i++;
                }
            }
            else{
                arr[i][j]=s.charAt(idx);
                if(i==0){
                    down =true;
                    i++;
                }
                else{
                    i--;
                    j++;
                }
            }
            idx++;
        }
        for(char[] h:arr) for(char a:h) if(a!=0) ans+=a;
        return ans;
    }
}