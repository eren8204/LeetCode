class Solution {
    public int minimumLines(int[][] stockPrices) {
        int l = stockPrices.length;
        if(l==1)
            return 0;
        if(l==2)
            return 1;
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        int c = 1;
        int p1 = stockPrices[1][0]-stockPrices[0][0];
        int p2 = stockPrices[1][1]-stockPrices[0][1];
        for(int i=2;i<l;i++){
            int d1 = stockPrices[i][0]-stockPrices[i-1][0];
            int d2 = stockPrices[i][1]-stockPrices[i-1][1];
            long s1 = p1*d2;
            long s2 = p2*d1;
            if(s2!=s1)
                c++;
            p1 = d1;
            p2 = d2;
        }
        return c;
    }
}