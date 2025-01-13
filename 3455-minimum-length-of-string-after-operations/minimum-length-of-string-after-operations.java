class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        int ans=0;
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            int a = e.getValue();
            if(a<3)
                ans+=a;
            else if(a%2==0)
                ans+=2;
            else if(a%2!=0)
                ans++;
        }
        return ans;
    }
}