class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<words2.length;i++){

            HashMap<Character,Integer> m = new HashMap<>();

            for(int j=0;j<words2[i].length();j++){
                char c = words2[i].charAt(j);
                m.put(c,m.getOrDefault(c,0)+1);
            }

            for(Map.Entry<Character,Integer> e : m.entrySet()){
                map.put(e.getKey(),Math.max(map.getOrDefault(e.getKey(),0),e.getValue()));
            }
        }

        List<String> ans = new ArrayList<>();

        for(int i=0;i<words1.length;i++){

            HashMap<Character,Integer> hm = new HashMap<>();

            for(int j=0;j<words1[i].length();j++){
                char c = words1[i].charAt(j);
                hm.put(c,hm.getOrDefault(c,0)+1);
            }

            int t = 0;
            for(Map.Entry<Character,Integer> e : map.entrySet()){
                if(hm.containsKey(e.getKey()) && hm.get(e.getKey())>=e.getValue())
                    t+=1;
                else
                    break;
            }
            
            if(t==map.size())
                ans.add(words1[i]);
        }
        return ans;
    }
}