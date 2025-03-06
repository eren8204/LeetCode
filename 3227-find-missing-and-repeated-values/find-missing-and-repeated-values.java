class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        int n = grid.length;
        int[] ar = new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[grid[i][j]-1]++;
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==2)
                ans[0] = i+1;
            if(ar[i]==0)
                ans[1] = i+1;
        }
        return ans;
    }
}