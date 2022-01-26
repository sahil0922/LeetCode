//optimal solution in O(m+n) instead of O(m*n)

public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = m - 1;
        int j = 0;
        
        while(i>=0 && j<n){
            if(matrix[i][j] > target){
                i--;
            }else if(matrix[i][j] < target){
                j++;
            }else{
                return true;
            }
        }
        
        return false;
    }
