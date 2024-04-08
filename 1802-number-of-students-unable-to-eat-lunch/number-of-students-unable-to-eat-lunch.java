class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<students.length;i++){
            l.add(students[i]);
            l1.add(sandwiches[i]);
        }
        int count = 0;
        while(true){
            if(l.isEmpty()) break;
            if(l.get(0)==l1.get(0)){
                l.remove(0);
                l1.remove(0);
                count =0 ;
            }
            else{
                int temp = l.remove(0);
                l.add(temp);
                count++;
            }
            if(count>=l.size()) break;
        }
        return l.size();
    }
}