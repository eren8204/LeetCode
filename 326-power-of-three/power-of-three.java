class Solution {
    public boolean isPowerOfThree(int n) {
        int c = 0;
        while(true){
            if(Math.pow(3,c)<n)
                c++;
            else if(Math.pow(3,c)==n)
                return true;
            else
                return false;
        }
    }
}