public ArrayList<TreeNode> nodeToRootPath(TreeNode node, TreeNode p){
        if(node == null) return new ArrayList<TreeNode>();
        
        if(node == p){
            ArrayList<TreeNode> list = new ArrayList<>();
            list.add(node);
            return list;
        }
        
        ArrayList<TreeNode> leftList = nodeToRootPath(node.left, p);
        if(leftList.size() > 0){
            leftList.add(node);
            return leftList;
        }
        
        ArrayList<TreeNode> rightList = nodeToRootPath(node.right, p);
        if(rightList.size() > 0){
            rightList.add(node);
            return rightList;
        }
        
        return new ArrayList<TreeNode>();
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = nodeToRootPath(root,p);
        ArrayList<TreeNode> path2 = nodeToRootPath(root,q);
        
        int i = path1.size() - 1;
        int j = path2.size() - 1;
        
        while(i >= 0 && j>= 0){
            if(path1.get(i) == path2.get(j)){
                i--;
                j--;
            }else{
                break;
            }
        }
        
        return path1.get(i + 1);
    }
