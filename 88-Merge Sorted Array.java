//without using extra space O(1) and in O(m+n) time

public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        
        while(i>=0 && j>=0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        
        //work for eg.3 when m = 0 and n >= 1
        while(j>= 0 && k>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
    }
