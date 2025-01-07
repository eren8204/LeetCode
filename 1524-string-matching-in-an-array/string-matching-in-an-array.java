class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        int n = words.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(words[i].indexOf(words[j])>-1)
                        hs.add(words[j]);
                }
            }
        }

        Iterator<String> it = hs.iterator();
        while(it.hasNext())
            ans.add(it.next());

        return ans;
    }
}