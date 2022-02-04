//O(N) time and space both

void listFill(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        
        listFill(root.left, list);
        list.add(root.val); //inorder traversal
        listFill(root.right, list);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        listFill(root, list);
        
        int i = 0;
        int j = list.size() - 1;
        boolean ans = false;
        
        while(i<j){
            int e1 = list.get(i);
            int e2 = list.get(j);
            
            if(e1 + e2 > k){
                j--;
            }else if(e1 + e2 < k){
                i++;
            }else{
                ans = true;
                break;
            }
        }
        
        return ans;
    }
