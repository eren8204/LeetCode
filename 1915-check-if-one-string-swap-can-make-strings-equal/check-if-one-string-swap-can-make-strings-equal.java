class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c : s1.toCharArray())
            map1.put(c,map1.getOrDefault(c,0)+1);
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c : s2.toCharArray())
            map2.put(c,map2.getOrDefault(c,0)+1);
        if(!map1.equals(map2))
            return false;
        int count = 0;
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)!=s2.charAt(i))
                count++;
        return count==2||count==0?true:false;
    }
}