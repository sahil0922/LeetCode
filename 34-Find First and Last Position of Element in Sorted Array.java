// time complexity of this is O(logn)

public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        
        int firstPlace = -1;
        
        int startingIndex = 0, endingIndex = nums.length - 1;
        
        while(startingIndex <= endingIndex){
            int midIndex = startingIndex + (endingIndex - startingIndex)/2;
            
            if(nums[midIndex] < target){
                startingIndex = midIndex + 1;
                
            }else if(nums[midIndex] > target){
                endingIndex = midIndex - 1;
                
            }else{
                firstPlace = midIndex;
                endingIndex = midIndex - 1;
            }
        }
        
        answer[0] = firstPlace;
        
        int lastPlace = -1;
        
        startingIndex = 0;
        endingIndex = nums.length - 1;
        
        while(startingIndex <= endingIndex){
            int midIndex = startingIndex + (endingIndex - startingIndex)/2;
            
            if(nums[midIndex] < target){
                startingIndex = midIndex + 1;
                
            }else if(nums[midIndex] > target){
                endingIndex = midIndex - 1;
                
            }else{
                lastPlace = midIndex;
                startingIndex = midIndex + 1;
            }
        }
        
        answer[1] = lastPlace;
        
        return answer;
        
    }
