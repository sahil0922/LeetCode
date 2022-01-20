//though approach is length in lines of code, still is O(N) in time complexity and even in space :)

public class DiaMover {
        int diameter = 0;
        
        DiaMover(int diameter){
            this.diameter = diameter;
        }
    }
    
    public int calculateDiameterReturnHeight(TreeNode root, DiaMover dia){
        if(root == null) return -1;
        
        int leftHeight = calculateDiameterReturnHeight(root.left, dia);
        int rightHeight = calculateDiameterReturnHeight(root.right, dia);
        
        int height = Math.max(leftHeight, rightHeight) + 1;
        
        if(leftHeight + rightHeight + 2 > dia.diameter){
            dia.diameter = leftHeight + rightHeight + 2;
        }
        
        return height;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        DiaMover dia = new DiaMover(0); 
        
        int height = calculateDiameterReturnHeight(root, dia);
        
        return dia.diameter;
    }
