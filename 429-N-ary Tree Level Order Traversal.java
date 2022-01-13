// this approach uses level order-line wise
// time complexity - O(N) N-total number of nodes in tree

public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        
        if(root == null){
           return new ArrayList<List<Integer>>();
        }
        
        LinkedList<Node> que = new LinkedList<>();
        que.add(root);
        
        
        while(que.size() > 0){
            List<Integer> list = new ArrayList<>();
            int currSize = que.size();
            
            while(currSize-- > 0){
                Node node = que.removeFirst();
                list.add(node.val);
                
                for(Node child : node.children){
                    que.addLast(child);
                }
            }
            
            if(list.size() > 0){
                mainList.add(list);
            }
        }
        
        return mainList;   
        
    }
