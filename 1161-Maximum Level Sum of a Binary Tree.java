//BFS approach
//time and space complexity both : O(N)

public class Pair {
        int level;
        int sum;
        
        Pair(int level, int sum){
            this.level = level;
            this.sum = sum;
        }
    }
    
    public int depth(TreeNode root){
        if(root == null) return 0;
        
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
    
    //I have used BFS but we can also use DFS...
    public int maxLevelSum(TreeNode root) {
         
         int level = depth(root);
        
         LinkedList<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         
         Pair p = new Pair(0,Integer.MIN_VALUE);
         int currLevel = 1;
         
         while(queue.size() > 0){
             int currSize = queue.size();
             int sum = 0;
             
             while(currSize-- > 0){
                 TreeNode rem = queue.removeFirst();
                 sum += rem.val;
                 
                 if(rem.left != null) queue.addLast(rem.left);
                 if(rem.right != null) queue.addLast(rem.right);
             }
             
             if(p.sum < sum){
                 p.sum = sum;
                 p.level = currLevel;
             }
             
             currLevel++;
         }
        
         return p.level;
    }
