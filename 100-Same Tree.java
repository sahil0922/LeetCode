//time complexity : O(N)
//space complexity : O(N)

public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        
        if(p.val != q.val) return false;
        
        boolean lp = isSameTree(p.left, q.left);
        if(lp == false) return false;
        
        boolean rp = isSameTree(p.right, q.right);
        if(rp == false) return false;
        
        return true;
    }
