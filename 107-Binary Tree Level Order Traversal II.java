//I have used BFS in here 
//check below for another method

public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null) return list;
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
            
        while(queue.size() > 0){
            int currsize = queue.size();
            List<Integer> li = new ArrayList<>();
            
            while(currsize-- > 0){
                TreeNode rem = queue.removeFirst();
                li.add(rem.val);
                
                if(rem.left != null) queue.addLast(rem.left);
                if(rem.right != null) queue.addLast(rem.right);
            }
            
            if(li.size() > 0){
                list.add(li);
            }
        }
        
        Collections.reverse(list);
        return list;
    }

//other method using stack 
public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Stack<Integer> st = new Stack<>();
        
        while(queue.size() > 0){
            int currsize = queue.size();
            
            while(currsize-- > 0){
                TreeNode rem = queue.removeFirst();
                st.push(rem.val);
                
                if(rem.left != null) queue.addLast(rem.left);
                if(rem.right != null) queue.addLast(rem.right);
            }
            
            st.push(-99999); // as we are given range of root.val as between -1000 to 1000
        }
        
        List<List<Integer>> list = new ArrayList<>();
        
        while(st.size() > 0){
            List<Integer> li = new ArrayList<>();
            
            while(st.size() > 0 && st.peek() != -99999){
                li.add(st.pop());
            }
            if(st.size() > 0){
                st.pop();
            }
            
            if(li.size() > 0){
                Collections.reverse(li);
                list.add(li);
            }
        }
        
        return list;
    }
