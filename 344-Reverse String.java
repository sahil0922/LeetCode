//since iterative is easy 
//I have solved using recursion

void reverseHelper(char[] s , int idx){
        if(idx == s.length) return;
        
        reverseHelper(s, idx + 1);
        
        if(idx >= s.length/2){
            char temp = s[idx];
            s[idx] = s[s.length - idx - 1];
            s[s.length - idx - 1] = temp;
        }
        
    }
    public void reverseString(char[] s) {
        reverseHelper(s, 0);   
    }
