//used BFS or (Level order traversal) 
//time and space both used is O(N)

public int height(TreeNode root){
        if(root == null) return -1;
        
        return Math.max(height(root.left),height(root.right)) + 1;  
    }
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        
        int height = height(root);
        
        int currHeight = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        
        while(queue.size() > 0){
            int currSize = queue.size();
            
            if(currHeight == height){
                while(currSize-- > 0){
                    TreeNode rem = queue.removeFirst();
                    result += rem.val;
                }
                break;
            }
            
            while(currSize-- > 0){
                TreeNode rem = queue.removeFirst();
                
                if(rem.left != null) queue.addLast(rem.left);
                if(rem.right != null) queue.addLast(rem.right);
            }
            
            currHeight++;
        }
        
        return result;
    }
