// i have Reverse pre-order and marked the level as visited
// as we have to insert only 1 element at each level 

//visited is required because we want to add 1 element at each level 
 public List<Integer> rightSideView(TreeNode root) {
        int level = height(root);
        boolean[] visited = new boolean[level];
        List<Integer> list = new ArrayList<>();
        
        fillRightSide(root,list,visited,0);
        
        return list;
    }
    
    public int height(TreeNode root){
        if(root == null) return 0;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    
    public void fillRightSide(TreeNode root, List<Integer> list, boolean[] visited,int currLevel){
        if(root == null) return;
        
        if(visited[currLevel] == false){
            list.add(root.val);
        }
        
        visited[currLevel] = true;
        
        fillRightSide(root.right, list, visited, currLevel + 1);
        fillRightSide(root.left, list, visited, currLevel + 1); 
    }
