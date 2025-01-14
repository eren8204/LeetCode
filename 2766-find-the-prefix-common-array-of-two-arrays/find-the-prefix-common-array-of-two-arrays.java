class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        int[] c = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!hs1.contains(A[i])){
                hs1.add(A[i]);
                if(hs2.contains(A[i]))
                    count++;
            }
                
            if(!hs2.contains(B[i])){
                hs2.add(B[i]);
                if(hs1.contains(B[i]))
                    count++;
            }
                
            c[i] = count;
        }
        return c;
    }
}