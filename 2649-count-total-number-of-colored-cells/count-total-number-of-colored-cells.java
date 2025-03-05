class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        for(int i=1;i<=n;i++){
            ans += (i-1)*4;
        }
        return ans;
    }
}
// 1, 5, 13, 25
// 4, 8, 12