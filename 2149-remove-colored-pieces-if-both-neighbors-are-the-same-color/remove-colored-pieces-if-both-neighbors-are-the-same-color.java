class Solution {
    public boolean winnerOfGame(String colors) {
        int alice=0;
        int bob=0;
        int cnt=0;
        for(char c:colors.toCharArray()){
            if(c=='A') cnt++;
            else{
                if(cnt>=3) alice+=(cnt-2);
                cnt=0;
            }
        }
        if(cnt>=3) alice+=(cnt-2);
        cnt=0;

        for(char c:colors.toCharArray()){
            if(c=='B') cnt++;
            else{
                if(cnt>=3) bob+=(cnt-2);
                cnt=0;
            }
        }
        if(cnt>=3) bob+=(cnt-2);
        
        return alice>bob;
    }
}