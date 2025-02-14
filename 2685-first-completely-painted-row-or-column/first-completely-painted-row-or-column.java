import java.util.Arrays;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int n = r * c;
        int[][] positions = new int[n + 1][2];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                positions[mat[i][j]][0] = i;
                positions[mat[i][j]][1] = j;
            }
        }
        
        int[] rows = new int[r];
        int[] cols = new int[c];

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int ro = positions[value][0];
            int co = positions[value][1];

            rows[ro]++;
            cols[co]++;
            if (rows[ro] == c || cols[co] == r) {
                return i;
            }
        }

        return -1;
    }
}
