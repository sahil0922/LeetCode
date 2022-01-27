//using pair approach
//time complexity : O(N)
//space complexity : O(height of tree)

public class pair{
        int sum = 0;
        int tilt = 0;
    }
    
    public pair findTiltH(TreeNode root){
        if(root == null) return new pair();
        
        pair lp = findTiltH(root.left);
        pair rp = findTiltH(root.right);
        
        int rootTilt = Math.abs(lp.sum - rp.sum);
        
        pair mp = new pair();
        mp.sum = lp.sum+rp.sum + root.val;
        mp.tilt = lp.tilt + rp.tilt + rootTilt;
        
        return mp;
        
    }
    
    public int findTilt(TreeNode root) {
        pair mp = new pair();
        
        mp = findTiltH(root);
        return mp.tilt;
    }
