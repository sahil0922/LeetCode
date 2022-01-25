//its O(N^2) worst case approach using 2 for loops and will upload the optimise appraoch later

public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : nums1){
            for(int j : nums2){
                if(i == j){
                    if(list.contains(i) == false){
                        list.add(i);
                    }
                }
            }
        }
        
        int[] res = new int[list.size()];
        
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
      
        return res;
    }
