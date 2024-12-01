class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }
        System.out.println(mp);
        for(int i:arr){
            if(mp.containsKey(i*2) ) {
                if(i!=0) return true;
                if(mp.get(i).size()>1 && i==0) return true;
            }
        }
        return false;
    }
}