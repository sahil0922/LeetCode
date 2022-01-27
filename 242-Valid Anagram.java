// O(N) time and space both

public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            
            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                hm.put(ch, val + 1);
            }else{
                hm.put(ch, 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                if(val > 1){
                    hm.put(ch, val - 1);
                }else{
                    hm.remove(ch); // here val will be 0 when we subtract so we are removing
                }
            }else{
                return false;
            }
        }
        
        return true;
    }
