class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[]arr1=new int[26];
        for(int i=0;i<p.length();i++){
            arr1[p.charAt(i)-97]+=1;
        }
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            int[]arr2=new int[26];
            for(int j=i;j<p.length()+i;j++){
                arr2[s.charAt(j)-97]+=1;
            }
            if(Arrays.equals(arr1,arr2)){
                l.add(i);
            }
        }
        return l;
    }
}