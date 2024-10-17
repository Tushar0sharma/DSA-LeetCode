class Solution {
    public int maximumSwap(int num) {
        String s=num+"";
        int []r=new int[s.length()];
        int max=-1;
        int idx=0;
        for(int i=s.length()-1;i>=0;i--){
            if(max<s.charAt(i)-'0'){
                idx=i;
                max=s.charAt(i)-'0';
            }
            r[i]=idx;
        }
        for(int g:r) System.out.print(g+" ");
        int i=0;
        char []ch=s.toCharArray();
        while( i<s.length()){
            if((ch[i]-'0')<(ch[r[i]]-'0')){
                char t=ch[i];
                ch[i]=ch[r[i]];
                ch[r[i]]=t;
                return Integer.parseInt(new String(ch));
            }
            i++;
        }
        return num;
    }
}