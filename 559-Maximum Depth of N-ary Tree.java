public int maxDepth(Node root) {
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
