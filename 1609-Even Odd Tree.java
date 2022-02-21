//i have used BFS algorithm

public boolean isEvenOddTree(TreeNode root) {
         LinkedList<TreeNode> queue = new LinkedList<>();
         queue.add(root);
        
         int currLevel = 0;
        
         while(queue.size() > 0){
             int currSize = queue.size();
             ArrayList<Integer> list = new ArrayList<>();//used for filling out the elements and checking the conditions on them
     
             while(currSize-- > 0){
                 TreeNode rem = queue.removeFirst();
                 list.add(rem.val);
                 
                 if(rem.left != null) queue.addLast(rem.left);
                 if(rem.right != null) queue.addLast(rem.right);
             }
             
             boolean checkingConditions = levelWiseChecking(currLevel, list);
             if(checkingConditions == false){
                 return false;
             }
             
             currLevel++;
         }
        
         return true;
    }
    
    //here we are checking every parameter mentioned in question
     public boolean levelWiseChecking(int currLevel, ArrayList<Integer> list){
        if(currLevel % 2 == 0){
                 if(list.size() == 1){
                     if(list.get(0) % 2 == 0){
                         return false;
                     }
                 }
                 for(int i = 0; i < list.size() - 1; i++){
                     int ith = list.get(i);
                     int ip1 = list.get(i + 1);
                     
                     if(ith % 2 == 0 || ip1 % 2 == 0){
                         return false;
                     }else if(ith >= ip1){
                         return false;
                     }
                 }
            
             }else{
                 if(list.size() == 1){
                     if(list.get(0) % 2 != 0){
                         return false;
                     }
                 }
                 for(int i = 0; i < list.size() - 1; i++){
                     int ith = list.get(i);
                     int ip1 = list.get(i + 1);
                     
                     if(ith % 2 == 1 || ip1 % 2 == 1){
                         return false;
                     }else if(ith <= ip1){
                         return false;
                     }
                 }
             }
         
         return true;  
    }
