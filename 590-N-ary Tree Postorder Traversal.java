public void postOrderHelper(Node root, List<Integer> list){
        
        for(Node child : root.children){
            postOrderHelper(child, list);
        }
        
        list.add(root.val);
        
    }
    
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        postOrderHelper(root, list);
        
        return list;
    }
