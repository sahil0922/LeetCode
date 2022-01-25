//best approach O(N) using freq array to store
public int[] intersection(int[] nums1, int[] nums2) {
        
        //since size of nums1 and nums2 is 1000
        
        int[] freq = new int[1001];
        
        for(int val : nums1){
            freq[val]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int val : nums2){
            if(freq[val] > 0){
                list.add(val);
                freq[val] = 0;
            }
        }
        
        int[] res = new int[list.size()];
        
        int i = 0;
        for(int val : list){
            res[i++] = val;
        }
        
        return res;
    }



//its O(N^2) worst case approach using 2 for loops 
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
