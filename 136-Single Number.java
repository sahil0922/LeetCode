//time complexity : O(N) , we are using xor
//space complexity : O(1)

public int singleNumber(int[] nums) {
        int result = 0;
        
        for(int val : nums){
            result ^= val;
        }
        
        return result;
    }
