//time complexity : O(N)
//space complexity : O(height)

public boolean helper(TreeNode node, int targetSum, int asf){
        if(node == null) return false;
        
        asf += node.val;
        
        if(node.left == null && node.right == null){
            if(targetSum == asf){
                return true;
            }else{
                return false;
            }
        }
        
        boolean lt = helper(node.left, targetSum, asf);
        if(lt == true) return true;
        
        boolean rt = helper(node.right, targetSum, asf);
        if(rt == true) return true;
    
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum , 0);
    }
