class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<=i;j++)
                hs.add(B[j]);

            for(int j=0;j<=i;j++)
                if(hs.contains(A[j]))
                    count++;
            c[i] = count;
        }
        return c;
    }
}