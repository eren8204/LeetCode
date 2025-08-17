class Solution {
    public boolean isPowerOfFour(int n) {
        int c = 0;
        while(true){
            if(Math.pow(4,c)<n)
                c++;
            else if(Math.pow(4,c)==n)
                return true;
            else
                return false;
        }
    }
}