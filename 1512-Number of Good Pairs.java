//Time complexity : O(N)
//Space complexity : O(N)

public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        int ans = 0;
        
        for(int key : map.keySet()){
            int freq = map.get(key);
            
            int pairs = (freq * (freq - 1) / 2);
            
            ans += pairs;
        }
        
        return ans;
    }
