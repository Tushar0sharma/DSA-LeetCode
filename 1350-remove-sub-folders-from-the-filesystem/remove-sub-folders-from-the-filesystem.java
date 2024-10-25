class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String>l=new ArrayList<>();
        Arrays.sort(folder);
        l.add(folder[0]);
        for(int i=1;i<folder.length;i++){

            String s=l.get(l.size()-1);
            s+='/';
            if(!folder[i].startsWith(s)){
                l.add(folder[i]);
            } 
        }
        return l;
    }
}