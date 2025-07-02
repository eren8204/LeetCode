class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        char check = 'A';
        for(char c : word.toCharArray()){
            ans += c==check?1:0;
            check = c;
        }
        return ans;
    }
}