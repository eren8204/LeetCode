class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> ans = new HashSet<>();
        HashSet<String> newSup = new HashSet<>();
        for(String s : supplies)
            newSup.add(s);
        int l = newSup.size();
        int o = 0;
        while(l!=o){
            for(int i=0;i<recipes.length;i++){
            List<String> required = new ArrayList<>();
            for(String s : ingredients.get(i)){
                required.add(s);
            }
            int flag = 0;
            for(String s : required){
                if(!newSup.contains(s)){
                    flag = 1;
                    break;
                }
            }   
                if(flag==0){
                    newSup.add(recipes[i]);
                    ans.add(recipes[i]);
                }
            }
            o = l;
            l = newSup.size();
        }        
        List<String> ansList = new ArrayList<>(ans);
        return ansList;
    }
}