class Solution {
    
    public int getMaximumGoldHelper(int[][] grid, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] == true || grid[i][j] == 0){
            return 0;
        }
        
        visited[i][j] = true;
        //i just need to stop where it will take me at base case
        
        int left = getMaximumGoldHelper(grid,i,j - 1, visited);
        int right = getMaximumGoldHelper(grid,i, j + 1, visited);
        int up = getMaximumGoldHelper(grid,i - 1, j, visited);
        int down = getMaximumGoldHelper(grid,i + 1, j, visited);
        
        int max = Math.max(left,Math.max(right, up));
        max = Math.max(max, down);
        
        visited[i][j] = false;
        
        return max + grid[i][j];
    }
    public int getMaximumGold(int[][] grid) {
        
        int max = -1;
        
        // as we can start and stop from any cell position so we are calling recursion to every cell and finding max amount
        for(int i = 0; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length; j++){
                int ans = getMaximumGoldHelper(grid,i,j,new boolean[grid.length][grid[0].length]);
                
                max = Math.max(max, ans);
            }
        }
        
        return max;
        
    }
}
