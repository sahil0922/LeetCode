public int maxDepth(Node root) {
        
        //base case
        if(root == null){
            return 0;
        }
        
        int depth = 0;
        
        for(Node child : root.children){
            int rans = maxDepth(child);
            depth = Math.max(rans, depth);
        }
        
        return depth + 1;
        
    }
