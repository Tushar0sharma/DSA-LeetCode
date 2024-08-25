class Solution {
    public int countPairs(int[] nums) {
        int cnt=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)  max=Math.max(max,(nums[i]+"").length());
        Map<String,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            for(String s:call(nums[i]+"",max)){
                if(mp.containsKey(s)){
                    cnt+=mp.get(s);
                }
            }
            mp.put(make(nums[i]+"",max),mp.getOrDefault(make(nums[i]+"",max),0)+1);
        }
        return cnt;
    }
    public void swap(int i,int j,char[]ch){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public String make(String num,int max){
        while(num.length()<max){
            num="0"+num;
        }
        return num;
    }
    public Set<String> call(String num,int max){
        Set<String>st=new HashSet<>();
        String m=make(num+"",max);
        st.add(m);
        char[]ch=m.toCharArray();
        for(int i=0;i<max-1;i++){
            for(int j=i+1;j<max;j++){
                swap(i,j,ch);
                st.add(new String(ch));
                for(int l=0;l<max-1;l++){
                    for(int k=l+1;k<max;k++){
                        if(ch[l]!=ch[k]){
                            swap(l,k,ch);
                            st.add(new String(ch));
                            swap(l,k,ch);
                        }
                    }
                }
                swap(i,j,ch);
            }
        }
        return st;
    }
}