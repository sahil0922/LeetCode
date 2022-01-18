public void inOrderHelper(TreeNode root, List<Integer> list){
        if(root == null) return;
        
        inOrderHelper(root.left, list);
        list.add(root.val);
        inOrderHelper(root.right, list);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        inOrderHelper(root, list);
        
        return list;
    }
