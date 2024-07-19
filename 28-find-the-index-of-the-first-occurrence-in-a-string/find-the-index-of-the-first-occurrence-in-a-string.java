class Solution {
    public int strStr(String h, String n) {
        int i=0;
        int j=0;
        while(j<n.length() && i<h.length()){
            int temp=i;
            while(j<n.length() && i<h.length() && n.charAt(j)==h.charAt(i)){
                i++;
                j++;
            }
            if(j==n.length()) return temp;
            i=temp+1;
            j=0;
        }
        return -1;
    }
}