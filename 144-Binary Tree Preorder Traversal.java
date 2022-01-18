void preOrderHelper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        
        list.add(root.val);
        
        preOrderHelper(root.left, list);
        preOrderHelper(root.right, list);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        preOrderHelper(root, list);
        
        return list;
    }
