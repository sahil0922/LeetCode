// 2 pointer approach : O(N) time complexity

public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        
        while(i<=j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                ans[k--] = nums[j] * nums[j];
                j--;
            }else{
                ans[k--] = nums[i] * nums[i];
                i++;
            }
        }
        
        return ans;
    }


// O(NlogN) time complexity
public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        
        int i = 0;
        for(int val : nums){
            ans[i++] = val * val;
        }
        
        Arrays.sort(ans);
        return ans;
    }

