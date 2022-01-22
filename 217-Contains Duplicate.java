//simple solution using O(N) time and O(N) space using HashSet

public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int val : nums){
            if(set.contains(val)) return true;
            else set.add(val);
        }
        return false;
    }
