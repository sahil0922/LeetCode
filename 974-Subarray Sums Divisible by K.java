public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        
        int sum = 0;
        int rem = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // rem as 0 and its freq as 1
        
        for(int val : nums){
            sum += val;
            
            rem = sum % k;
            if(rem < 0) rem += k;
            
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            
            map.put(rem, map.getOrDefault(rem,0) + 1);
        }
        
        return count;
    }
