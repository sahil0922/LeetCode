//time complexity : O(log N)
//space complexity : O(log N)

class Solution {
    public double myPowHelper(double x, long n) {
        if(n == 0) return 1.0;
        
        double rans = myPowHelper(x, n/2);
        
        if(n % 2 == 0){
            return rans * rans;
        }else{
            return rans * rans * x;
        }
    }
    
    public double myPow(double x, int n) {
        
       long N = n; // as we have some test case close to Integer.min_value and max_value
        
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        
        return myPowHelper(x, N);
    }
}
