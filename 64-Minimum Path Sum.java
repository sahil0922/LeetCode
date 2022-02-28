//used memoization technique
    public int minPathHelper(int[][] grid, int i, int j, int[][] dp){
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length){
            return Integer.MAX_VALUE;
        }else if(i == grid.length - 1 && j == grid[0].length - 1){
            return grid[i][j];
        }
        
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        
        int Hcost = minPathHelper(grid, i, j + 1, dp);
        int Vcost = minPathHelper(grid, i + 1, j, dp);
        
        int minCost = Math.min(Hcost, Vcost) + grid[i][j];
        
        dp[i][j] = minCost;
        
        return minCost;
    }
    
    public int minPathSum(int[][] grid) {
        
        return minPathHelper(grid,0,0, new int[grid.length][grid[0].length]);
    }
