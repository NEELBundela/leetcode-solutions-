class Solution {
    boolean seen[][];
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int max_area = 0;
        int row =  grid.length;
        int column = grid[0].length;

        seen = new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                max_area = Math.max(max_area,dfs(grid,i,j));
            }
        }
        return max_area;
    }
    private int dfs(int[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || seen[i][j] || grid[i][j]==0){
            return 0;
        }
        // grid[i][j]=0;
        seen[i][j]=true;

       return (1 + dfs(grid,i+1,j) +
        dfs(grid,i-1,j) + 
        dfs(grid,i,j+1) +
        dfs(grid,i,j-1));
    }
}