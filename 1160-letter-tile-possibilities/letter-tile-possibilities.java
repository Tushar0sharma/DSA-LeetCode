class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String>s=new HashSet<>();
        boolean[]vis=new boolean[tiles.length()];
        permute(s,tiles,"",vis);
        return s.size()-1;
    }
    public void permute(Set<String>s,String tiles,String ans,boolean[]vis){
        s.add(ans);
        for(int i=0;i<tiles.length();i++){
            if(!vis[i]){
                vis[i]=true;
                permute(s,tiles,ans+tiles.charAt(i),vis);
                vis[i]=false;
            }
        }
    }
}