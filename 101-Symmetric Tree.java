//time complexity : O(N)

public boolean helper(TreeNode node1, TreeNode node2){
         if(node1 == null && node2 == null) return true;
         else if(node1 == null || node2 == null) return false;
         
         if(node1.val != node2.val) return false;
        
         boolean lt = helper(node1.left, node2.right);
         if(lt == false) return false;
        
         boolean rt = helper(node1.right, node2.left);
         if(rt == false) return false;
        
         return true;
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        return helper(root.left, root.right);
    }
