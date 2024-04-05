class Solution {
    public String makeGood(String s) {
        if(s.length()==1) return s;
        int cnt=1;
        String s1="";
        while(cnt!=0){
            cnt=0;
            if(s.length()==1) break;
            s1="";
             System.out.print(s+" 1");
        for(int i=0;i<=s.length()-1;i++){
            char ch1=Character.toLowerCase(s.charAt(i));
            // char ch2=Character.toLowerCase(s.charAt(i+1));
            if(i<=s.length()-2 && Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i+1)) && ch1==Character.toLowerCase(s.charAt(i+1))){
                cnt++;
                i++;
                // if(i==s.length()-2 ){
                // s1=s1+s.charAt(i+1);
                // }
            }
            else if(i<=s.length()-2 && Character.isUpperCase(s.charAt(i+1)) && Character.isLowerCase(s.charAt(i)) && ch1==Character.toLowerCase(s.charAt(i+1))){
                cnt++;
                i++;
                // if(i==s.length()-2 ){
                // s1=s1+s.charAt(i+1);
                // }
            }
            // else if(i==s.length()-2 ){
            //     s1=s1+s.charAt(i)+s.charAt(i+1);
            // }
            else {
                s1=s1+s.charAt(i);                
            }     
        }
        // if(s.length()==3 && cnt!=0){
        //     s1=s1+s.charAt(s.length()-1);
        // }
          System.out.print(s1+" 1"); 
        s=s1; 
        }
        return s1;
    }
}