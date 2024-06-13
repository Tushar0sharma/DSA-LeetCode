class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]!=i+1){
                if(arr[arr[i]-1]==arr[i]) break;
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i+1!=arr[i]){
                l.add(i+1);
            }
        }
        return l;
    }
}