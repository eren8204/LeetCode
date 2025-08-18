class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Integer> set = new HashSet<>();
        for(char c : word.toCharArray())
            set.add((int)c);
        int ans=0;
        for(int i : set)
            if(set.contains(i-32)||set.contains(i+32))
                ans++;
        return ans/2;
    }
}