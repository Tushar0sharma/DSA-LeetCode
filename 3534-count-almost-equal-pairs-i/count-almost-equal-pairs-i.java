class Solution {
    public int countPairs(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(c(nums[i],nums[j])) cnt++;
            }
        }
        return cnt;
    }
    public boolean c(int a,int b){
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        if(s1.equals(s2)) return true;
        
        while(s1.length()>s2.length()){
            s2="0"+s2;
        }
        while(s1.length()<s2.length()){
            s1="0"+s1;
        }
        char []ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();
        for(int i=0;i<s1.length()-1;i++){
            for(int j=i+1;j<s1.length();j++){
                char temp=ch1[i];
                ch1[i]=ch1[j];
                ch1[j]=temp;
                String s=new String(ch1);
                if(s.equals(s2)) return true;
                temp=ch1[i];
                ch1[i]=ch1[j];
                ch1[j]=temp;
            }
        }

        for(int i=0;i<s1.length()-1;i++){
            for(int j=i+1;j<s1.length();j++){
                char temp=ch2[i];
                ch2[i]=ch2[j];
                ch2[j]=temp;
                String s=new String(ch2);
                if(s.equals(s1)) return true;
                temp=ch2[i];
                ch2[i]=ch2[j];
                ch2[j]=temp;
            }
        }
        return false;
    }
}