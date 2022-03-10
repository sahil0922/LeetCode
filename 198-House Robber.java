public int robHelper(int[] nums, int i,int[] dp){
        
        if(i >= nums.length) return 0;
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        int op1 = robHelper(nums, i + 1, dp);
        int op2 = robHelper(nums, i + 2, dp) + nums[i];
        
        int ans = Math.max(op1,op2);
        
        dp[i] = ans;
        return ans;

    }
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        
        for(int i = 0; i < nums.length; i++){
            int rans = robHelper(nums,i,dp);
        }
        
        int maxAmount = 0;
        for(int val : dp){
            maxAmount = Math.max(maxAmount,val);
        }
        
        return maxAmount;
}
