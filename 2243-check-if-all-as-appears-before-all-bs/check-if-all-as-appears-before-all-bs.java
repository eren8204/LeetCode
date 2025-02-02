class Solution {
    public boolean checkString(String s) {
        boolean isB = false;
        for(char c : s.toCharArray()){
            if(c=='b')
                isB = true;
            if(c=='a' && isB)
                return false;
        }
        return true;
    }
}