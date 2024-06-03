class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>mp=new HashMap<>();

        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        List<Character>l=new ArrayList<>(mp.keySet());
        Collections.sort(l,(a,b)->(mp.get(b)-mp.get(a)));

        StringBuilder sb=new StringBuilder();
        for(char c:l){
            for (int i = 0; i < mp.get(c); i++) {
			    sb.append(c);
		    }
        }
        return sb.toString();
    }
}