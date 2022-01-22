//Approach 1
public int reverse(int x){
        int rev = 0;
        
        int digit = 0;
        int temp = x;
        while(temp > 0){
            temp = temp / 10;
            digit++;
        }
        
        while(x > 0){
            int a = (x % 10) * ((int)Math.pow(10, digit - 1));
            x = x / 10;
            
            rev += a;
            digit--;
        }
        return rev;
    }
    
    public boolean isPalindrome(int x) {
        
        return x == reverse(x);
    }

//Approach 2
public int digits(int x){
        int ans = 0;
        
        while(x > 0){
            x = x / 10;
            ans++;
        }
        
        return ans;
    }
    
    public boolean isPalindrome(int x) {
            if(x < 0) return false;
        
           int digit = digits(x);
           
           while(digit > 0){
               int power = (int)Math.pow(10, digit - 1);

               int a = x % 10;
               int b = x / power;
               
               if(a != b) return false;
                               
                x = x % power;
                x = x / 10;
                digit -= 2;
           }
        
         return true;
    }

