class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int []cnt=new int[26];
            for(int j=i;j<s.length();j++){
                ++cnt[s.charAt(j)-'a'];
                int beauty=getmax(cnt)-getmin(cnt);
                sum+=beauty;
            }
        }
        return sum;
    }
    public int getmin(int[]cnt){
        int min=Integer.MAX_VALUE;
        for(int i:cnt){
            if(i!=0)
            min=Math.min(min,i);
        }
        return min;
    }
    public int getmax(int[]cnt){
        int max=Integer.MIN_VALUE;
        for(int i:cnt){
            if(i!=0)
            max=Math.max(max,i);
        }
        return max;
    }
}