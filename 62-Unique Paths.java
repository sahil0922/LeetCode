     //Memoization Aproach
     public int uniquePathHelper(int i, int j,int m, int n, int[][] dp){
        if(i == m - 1 && j == n - 1){
            return 1;
        }
        
        if(i >= m || j >= n) return 0;
        
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        
        int right = uniquePathHelper(i, j + 1, m, n, dp);
        int left = uniquePathHelper(i + 1, j, m , n, dp);
        
        int ans = right + left;
        
        dp[i][j] = ans;
        
        return ans;
        
    }
    
    public int uniquePaths(int m, int n) {
//         int path = uniquePathHelper(0,0,m,n,new int[m][n]);
        
//         return path;
        
        //Tabulation Approach
        int[][] dp = new int[m][n];
        
        for(int i = m - 1; i>=0; i--){
            for(int j = n - 1; j>=0; j--){
                if(i == m - 1 && j == n - 1){
                    dp[i][j] = 1;
                }
                else if(i == m - 1){
                    dp[i][j] += dp[i][j + 1];
                }
                else if(j == n - 1){
                    dp[i][j] += dp[i + 1][j];
                }
                else{
                    dp[i][j] += (dp[i][j + 1] + dp[i+1][j]);
                }
            }
        }
        
        return dp[0][0];
    }
