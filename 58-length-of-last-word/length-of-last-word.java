class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int i = s.length()-1;
        while(i <= s.length()-1 && i >= 0 && s.charAt(i)==32)
            i--;
        while(i <= s.length()-1 && i >= 0 && s.charAt(i)!=32){
            ans++;
            i--;
        }
        return ans;
    }
}