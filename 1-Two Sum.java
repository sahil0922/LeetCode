// O(N^2) approach using 2 loops

public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        for(int i = 0; i<nums.length; i++){
            
            for(int j = i+1; j<nums.length; j++){
                
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }   
            }
        }
           return ans;
    }


//O(N) approach using HashMap/HashTable

public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            else{
                map.put(nums[i], i);
            }
        }
        
        return res;
    }
