class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String s:details){
            String k=s.substring(11,13);
            if(Integer.parseInt(k)>60) cnt++;
        }
        return cnt;
    }
}