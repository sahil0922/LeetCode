//O(N) time and space both

public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            
            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                hm.put(ch, val + 1);
            }else{
                hm.put(ch, 1);
            }
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            
            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                if(val > 1){
                    hm.put(ch, val - 1);
                }else{
                    hm.remove(ch);
                }
            }else{
                return false;
            }
        }
        
        return true;
    }
