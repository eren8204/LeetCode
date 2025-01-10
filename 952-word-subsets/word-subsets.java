class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int word[] = new int[26];
        
        for(String s : words2){
            int temp[] = new int[26];
            for(char c : s.toCharArray()){
                temp[c-'a']++;
                word[c-'a'] = Math.max(word[c-'a'],temp[c-'a']);
            }
        }
        List<String> ans = new ArrayList<>();
        
        for(String s : words1){
            int pr[] = new int[26];
            for(char c : s.toCharArray()){
                pr[c-'a']++;
            }
            if(isParent(pr,word))
                ans.add(s);
        }
        return ans;
    }
    public boolean isParent(int[] s,int[] t){
        for(int i=0;i<26;i++)
            if(s[i]<t[i])
                return false;
        return true;
    }
}