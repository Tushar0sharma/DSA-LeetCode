class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        Map<Character,Integer>mp=new HashMap<>();
        mp.put('c',0);
        mp.put('r',0);
        mp.put('o',0);
        mp.put('k',0);
        mp.put('a',0);

        int max=0;
        int active=0;
        for(char ch:croakOfFrogs.toCharArray()){
            if(ch=='c'){
                active++;
                mp.put('c',mp.getOrDefault('c',0)+1);
            }
            else if(ch!='k'){
                if(ch=='r' && mp.get('c')==0) return -1;
                else if(ch=='o' && mp.get('r')==0) return -1;
                else if(ch=='a' && mp.get('o')==0) return -1;  

                if(ch=='r'){
                    mp.put(ch,mp.getOrDefault(ch,0)+1); 
                    mp.put('c',mp.getOrDefault('c',0)-1);
                }
                else if(ch=='o'){
                    mp.put(ch,mp.getOrDefault(ch,0)+1); 
                    mp.put('r',mp.getOrDefault('r',0)-1);
                }
                else{
                    mp.put(ch,mp.getOrDefault(ch,0)+1); 
                    mp.put('o',mp.getOrDefault('o',0)-1);
                }                
            }
            else{
                if(ch=='k' && mp.get('a')==0) return -1;  
                mp.put('a',mp.getOrDefault('a',0)-1);
                active--;
            }
            max=Math.max(max,active);
        }
        if(active>0) return -1;
        return max;
        
        
    }
}