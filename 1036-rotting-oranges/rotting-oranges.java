class Solution {
    public int orangesRotting(int[][] grid) {
       if(grid==null || grid.length==0)
            return -1;

        int row = grid.length;
        int column = grid[0].length;
        int[][] time = new int[row][column];
        for(int i=0;i<row;i++)
            Arrays.fill(time[i],Integer.MAX_VALUE);
        
        
        for(int i =0 ;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==2)
                    dfs(grid,time,i,j,0);
            }
        }
        int timere = 0;
        for(int i =0 ;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE) return -1;
                    timere=Math.max(timere,time[i][j]);
                }
            }
        }
        return timere;
    }
    private void dfs(int[][] grid,int[][] time,int i,int j,int timecount){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || timecount>=time[i][j])
            return;
        time[i][j]=timecount;

        dfs(grid,time,i-1,j,timecount+1);
        dfs(grid,time,i+1,j,timecount+1);
        dfs(grid,time,i,j-1,timecount+1);
        dfs(grid,time,i,j+1,timecount+1);
    }
}