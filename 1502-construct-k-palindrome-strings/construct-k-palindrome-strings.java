class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)
            return false;
        int freq[] = new int[26];

        for(char c : s.toCharArray())
            freq[c-'a']++;
        
        int m=0;
        for(int i=0;i<26;i++)
            if(freq[i]>0 && freq[i]%2!=0)
                m++;
        
        return m<=k;
    }
}