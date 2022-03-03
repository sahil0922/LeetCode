//used Recursion + Memoization
    public int helper(int[][] grid,int i, int j,Integer[][] dp){
        if(i >= grid.length || j >= grid[0].length || grid[i][j] == 1){
            return 0;
        }
        
        if(i == grid.length - 1 && j == grid[0].length - 1){
            return 1;
        }
     
        if(dp[i][j] != null){
            return dp[i][j];
        }
        
        int right = helper(grid,i, j + 1,dp);
        int down = helper(grid,i + 1, j,dp);
        
        int ans = right + down;
        
        dp[i][j] = ans;
        
        return ans;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int path = helper(obstacleGrid,0,0, new Integer[obstacleGrid.length][obstacleGrid[0].length]);
        
//         return path;
        
        
        //using Tabulation
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        Integer[][] dp = new Integer[m][n];
        
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = null;
                    continue;
                }
                
                if(i == m - 1 && j == n - 1){
                    dp[i][j] = 1;
                }
                else if(i == m - 1){
                    if(dp[i][j + 1] != null){
                        dp[i][j] = dp[i][j + 1];
                        
                    }
                }
                else if(j == n - 1){
                    if(dp[i + 1][j] != null){
                        dp[i][j] = dp[i + 1][j];
                    }
                }
                else{
                    int x = 0;
                    if(dp[i][j + 1]!= null){
                        x += dp[i][j + 1];
                    }
                    if(dp[i + 1][j] != null){
                        x += dp[i + 1][j];
                    }
                    dp[i][j] = x;
                }
            }
        }
        
        
