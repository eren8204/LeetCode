class Solution {
    public int minimumLength(String s) {
        int ar[] = new int[26];
        for(char c : s.toCharArray())
            ar[c-'a']++;
        int ans=0;
        for(int i=0;i<26;i++){
            if(ar[i]<3)
                ans+=ar[i];
            else if(ar[i]%2==0)
                ans+=2;
            else if(ar[i]%2!=0)
                ans++;
        }
        return ans;
    }
}