public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            int count = queue.size();
            
            while(count-- > 0){
                TreeNode rnode = queue.removeFirst();
                list.add(rnode.val);
                
                if(rnode.left != null) queue.addLast(rnode.left);
                if(rnode.right != null) queue.addLast(rnode.right);
            }
            
            if(list.size() > 0){
                mainList.add(list);
            }   
        }
        
        return mainList;
    }
