// will upload optimsed approach later
//time complexity : O(n + m)
//space complexity : O(n + m)

public int[] mergeTwoArray(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length + nums2.length];
        int i = 0; 
        int j = 0;
        int k = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                res[k++] = nums1[i];
                i++;
            }else{
                res[k++] = nums2[j];
                j++;
            }
        }
        
        while(i < nums1.length){
            res[k++] = nums1[i++];
        }
        
        while(j < nums2.length){
            res[k++] = nums2[j++];
        }
        
        return res;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = mergeTwoArray(nums1, nums2);
       
        int length = res.length;
        double median = 0.0;
        
        if(length % 2 != 0){
            median = (double)(res[length/2]);
        }else{
            median = (double)(res[length/2] + res[(length/2) - 1]) / 2;
        }
        
        return median;
    }
