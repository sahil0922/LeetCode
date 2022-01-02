public int finalValueAfterOperations(String[] operations) {
        
        int x = 0;
        
        for(String s : operations){
            
            if(s.charAt(1) == '+'){
                x++;
            }else{
                x--;
            }
            
        }
        
        return x;
        
    }

// alternate naive solution 

public int finalValueAfterOperations(String[] operations) {
        
        int x = 0;
        
        for(String s : operations){
            if(s.equals("--X")){
                x = x - 1;
                
            }else if(s.equals("X--")){
                x = x - 1;
                
            }else if(s.equals("++X")){
                x = x + 1;
                
            }else if(s.equals("X++")){
                x = x + 1;
            }

        }
        
        return x;
        
    }
