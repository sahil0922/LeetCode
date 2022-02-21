//used divide and conquer algorithm

public class Pair {
        int max;
        int index;
        
        Pair(int max, int index){
            this.max = max;
            this.index = index;
        }
    }
    
    public Pair maxElement(int[] nums, int i, int j){
        Pair p = new Pair(Integer.MIN_VALUE, -1);
        
        for(int idx = i; idx <= j; idx++){
            if(nums[idx] > p.max){
                p.max = nums[idx];
                p.index = idx;
            }
        }
        return p;
    }
    
    public TreeNode constructHelper(int[] nums,int i, int j){
        if(i > j){
            return null;
        }
        Pair p = maxElement(nums,i,j);
        
        TreeNode root = new TreeNode(p.max,null,null);
        root.left = constructHelper(nums,i, p.index - 1);
        root.right = constructHelper(nums,p.index + 1, j);
        
        return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        TreeNode root = constructHelper(nums,0, nums.length - 1);
        
        return root;
    }
