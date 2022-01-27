//O(N) time and O(1) space

public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomChar = new int[26];
        int[] magazineChar = new int[26];
        
        for(int i = 0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            
            ransomChar[ch - 'a']++;
        }
        
        for(int i = 0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            
            magazineChar[ch - 'a']++;
        }
        
        //find length of non zero ransomchar elements
        int anslen = 0;
        for(int val : ransomChar){
            if(val != 0){
                anslen++;
            }
        }
        
        int actualLen = 0;
        for(int i = 0; i < 26; i++){
            if(ransomChar[i] != 0){
                if(ransomChar[i] <= magazineChar[i]){
                    actualLen++;
                }
            }
        }
        
        if(actualLen == anslen){
            return true;
        }else{
            return false;
        }
    }


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
