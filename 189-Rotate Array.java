public static void reverse(int[] nums, int si, int ei){
      //si - starting index, ei - ending index
        while(si<=ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            
            si++;
            ei--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        reverse(nums, 0 , nums.length - k - 1);
        reverse(nums, nums.length - k , nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        
    }
