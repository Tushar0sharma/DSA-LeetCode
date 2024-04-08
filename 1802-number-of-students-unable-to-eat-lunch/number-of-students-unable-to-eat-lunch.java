class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<students.length;i++){
            l.add(students[i]);
            l1.add(sandwiches[i]);
        }
        while(l.size()>0){
            // if(l.isEmpty()) break;;
            if(l1.size()>0 && l.get(0)==l1.get(0)){
                l.remove(0);
                l1.remove(0);
            }
            else if(!l.contains(l1.get(0))){
                break;
            }
            else{
                swap(l);
            }
        }
        return l.size();
    }
    public void swap(List<Integer>l){
        int t=l.get(0);
        for(int i=0;i<l.size()-1;i++){
            l.set(i,l.get(i+1));
        }
        l.set(l.size()-1,t);
    }
}