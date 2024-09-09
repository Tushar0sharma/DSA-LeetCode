class Solution {
    public boolean isValidSerialization(String preorder) {
        String []a=preorder.split(",");
        int d=1;
        for(String n:a){
            if(--d<0) return false;
            if(!n.equals("#")) d+=2;
        }
        return d==0;
    }
}