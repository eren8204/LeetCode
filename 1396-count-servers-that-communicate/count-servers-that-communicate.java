class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ar = new int[n][m];
        int[][] br = new int[n][m];
        int total = 0;
        int iso = 0;
        for(int i=0;i<n;i++){
            int col = -1;
            int c = 0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    total++;
                    c++;
                    col = j;
                }
            }
            if(c==1){
                iso+=isAlone(col,grid)?1:0;
            }
        }
        return total-iso;
    }
    public boolean isAlone(int col,int[][] grid){
        int count = 0;
        for(int i=0;i<grid.length;i++)
            if(grid[i][col]==1)
                count++;
        return count==1;
    }
}