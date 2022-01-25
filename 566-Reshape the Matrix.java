//time complexity is ideal O(m*n) but have taken extra space of O(m*n) which can be optimised

public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(m * n != r*c){
            return mat;
            
        }else if(m == r || n == c){
            return mat;
        }
        
        int[][] ans =  new int[r][c];
        
        int[] temp = new int[mat.length * mat[0].length];
        int p = 0;
        
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                temp[p++] = mat[i][j];
            }

        }
        
        p = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = temp[p++];
            }
        }
        
        return ans;
        
    }
