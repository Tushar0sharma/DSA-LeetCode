class Solution {
    public boolean canChange(String start, String target) {
        int n=start.length();
        int m=target.length();
        int i=0,j=0;
        while(i<n || j<m){
            while(i<n && start.charAt(i)=='_') i++;
            while(j<m && target.charAt(j)=='_') j++;
            if(i==n && j==m) return true;
            if(i==n || j==m || start.charAt(i)!=target.charAt(j)) return false;
            if((target.charAt(j)=='L' && i<j) || (target.charAt(j)=='R' && j<i)) return false;
            i++;
            j++;
        }
        return true;
    }
}