void dfs(char[][] grid, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        }
        
        if(visited[i][j] == true || grid[i][j] == '0'){
            return;
        }
        
        visited[i][j] = true;
        
        dfs(grid, i + 1, j, visited);
        dfs(grid, i - 1, j, visited);
        dfs(grid, i , j + 1, visited);
        dfs(grid, i , j - 1, visited);
        
    }
    
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visited[i][j] == false && grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j , visited);
                }
            }
        }
        
        return count;
    }
