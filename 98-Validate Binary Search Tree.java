public class pair{
        long min = Long.MAX_VALUE; // if value is close to integer max infinity then we need to use this
        long max = Long.MIN_VALUE;
        boolean isBST = true;
    }
    
    public pair isValidBSTHelper(TreeNode root){
        if(root == null) return new pair();
        
        pair lp = isValidBSTHelper(root.left);
        pair rp = isValidBSTHelper(root.right);
        
        pair mp = new pair();
        mp.min = Math.min(root.val, Math.min(lp.min, rp.min));
        mp.max = Math.max(root.val, Math.max(lp.max, rp.max));
        
        boolean nodeisBST = root.val > lp.max && root.val < rp.min;
        
        mp.isBST = (lp.isBST == true) && (rp.isBST == true) && (nodeisBST == true);
        
        return mp;
    }
    
    public boolean isValidBST(TreeNode root) {
        pair mp = new pair();
        
        mp = isValidBSTHelper(root);
        
        return mp.isBST;
    }
