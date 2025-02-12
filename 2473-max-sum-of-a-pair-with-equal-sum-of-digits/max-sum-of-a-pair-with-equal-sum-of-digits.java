class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer>freqsum=new HashMap<>();
        Map<Integer,List<Integer>>mp=new HashMap<>();
        int max=-1;
        for(int number:nums){
            int sum=0;
            int num=number;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            freqsum.put(sum,freqsum.getOrDefault(sum,0)+1);
            if(!mp.containsKey(sum)){
                mp.put(sum,new ArrayList<>());
            }
            mp.get(sum).add(number);
        }
        for (List<Integer> list : mp.values()) {
            if (list.size() >= 2) {
                Collections.sort(list, Collections.reverseOrder()); 
                max = Math.max(max, list.get(0) + list.get(1));
            }
        }
        return max;
    }
}