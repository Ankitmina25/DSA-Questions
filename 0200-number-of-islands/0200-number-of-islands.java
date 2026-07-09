class Solution {
    public boolean dfs(char[][] grid,boolean[][] visit,int i,int j){
            if(i<0 || j<0 || j>=grid[0].length || i>=grid.length || grid[i][j]=='0' || visit[i][j]) return false;
            visit[i][j]=true;
            if(dfs(grid,visit,i-1,j)) return true;
            if(dfs(grid,visit,i+1,j)) return true;
            if(dfs(grid,visit,i,j-1)) return true;
            if(dfs(grid,visit,i,j+1)) return true;
            return false;
    }
    public int numIslands(char[][] grid) {
        int count=0;
        boolean [][] visit= new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visit[i][j]) {
                    count++;
                    dfs(grid,visit,i,j);
                }
            }
        }
        return count;
    }
}