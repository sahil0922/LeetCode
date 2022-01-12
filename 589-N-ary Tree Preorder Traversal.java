public void preorderHelper(Node root, List<Integer> list){
        if(root == null) return;
        
        list.add(root.val);
        
        for(Node child : root.children){
            preorderHelper(child, list);
        }
   }
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        
        preorderHelper(root,list);
        return list;
    }
