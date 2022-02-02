//time complexity : O(logN)
//space complexity : O(logN)

public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val, null,null);
        }
        
        if(root.val > val){
            TreeNode li = insertIntoBST(root.left, val);
            root.left = li;
        }else if(root.val < val){
            TreeNode ri = insertIntoBST(root.right, val);
            root.right = ri;
        }
        
        return root;
    }
