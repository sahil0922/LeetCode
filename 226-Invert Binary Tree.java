//time complexity = O(N)
//space complexity = O(N) --- recursive stack

public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        TreeNode li = invertTree(root.left);
        TreeNode ri = invertTree(root.right);
        
        root.left = ri;
        root.right = li;
        
        return root;
    }
