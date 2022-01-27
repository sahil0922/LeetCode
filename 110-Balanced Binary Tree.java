//using travel and tweek stratergy ...ie. keeping a static variable in heap and tweeking it in every iteration
//time complexity : O(N)
//space complexity : O(height of tree)

public static boolean treeisBal = true;
    
    public int height(TreeNode root){
        if(root == null) return -1;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int height = Math.max(lh,rh) + 1;
        
        boolean nodeisBal = Math.abs(lh - rh) <= 1;
        if(nodeisBal == false){
            treeisBal = false;
        }
        
        return height;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int height = height(root);
        
        boolean ans = treeisBal;
        
        treeisBal = true; // for next test case else this will remain always unchanged
        
        return ans;
    }
