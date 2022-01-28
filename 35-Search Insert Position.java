//time complexity is O(logN) and space complexity is constant

public int searchInsert(int[] nums, int target) {
        int idx = -1;
        
        int i = 0;
        int j = nums.length - 1;
        
        while(i <= j){
            int mid = (i + j)/2;
            
            if(nums[mid] < target){
                i = mid + 1;
                idx = i;
            }else if(nums[mid] > target){
                j = mid - 1;
                idx = i;
            }else{
                return mid;
            }
        }
        
        return idx;
  
    }
