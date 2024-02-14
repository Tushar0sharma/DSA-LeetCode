class Solution {
    public boolean rotateString(String s, String goal) {
        char ch=goal.charAt(0);
        int slen=s.length();
        int goall=goal.length();
        if(slen!=goall){
            return false;
        }
        s+=s;
        for(int i=0;i<=slen;++i){
            if(ch==s.charAt(i)){
              int j=0;
              while(++j < goall && s.charAt(i+j)==goal.charAt(j));
                  if(j==goall){
                      return true;
                  }
              
            }
        }
        return false;
    }
}