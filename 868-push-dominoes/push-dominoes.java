class Solution {
    public String pushDominoes(String s) {
        int n=s.length();
        int []l=new int[n];
        int[]r=new int[n];
        char prev='.';
        int cnt=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                prev='R';
                cnt=1;
            } 
            else if(s.charAt(i)=='L'){
                prev='L';
            }
            if(s.charAt(i)=='.' && prev=='R') l[i]=cnt++;
        }
        prev='.';
        cnt=1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='L') {
                prev='L';
                cnt=1;
            }
            else if(s.charAt(i)=='R') prev='R';
            if(s.charAt(i)=='.' && prev=='L') r[i]=cnt++;
        }
        // System.out.println(Arrays.toString(l));
        // System.out.println(Arrays.toString(r));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(l[i]==0 && r[i]==0) sb.append(s.charAt(i));
            else if(l[i]==0) sb.append("L");
            else if(r[i]==0) sb.append("R");
            else if(l[i]==r[i]) sb.append(".");
            else if(l[i]>r[i]) sb.append("L");
            else sb.append("R");
        }
        return sb.toString();
    }
}