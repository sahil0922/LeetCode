//used kadane's Algorithm

public int maxSubArray(int[] nums) {
        
        int currSum = 0;
        int overSum = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            currSum += nums[i];
            
            if(currSum > overSum)
                overSum = currSum;
            
            if(currSum < 0)
                currSum = 0;
        }
        
        return overSum;
    }
