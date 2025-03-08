class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int s = 0;
        int e = s+k;
        int min = n;
        while(e<=n && s<e){
            int b = 0;
            int w = 0;
            for(int i=s;i<e;i++){
                if(blocks.charAt(i)=='B')
                    b++;
                else
                    w++;
            }
            min = Math.min(w,min);
            s++;
            e = s+k;
        }
        return min;
    }
}