class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        String vowels = "AEIOUaeiou";
        List<Integer> vowi = new ArrayList<>();
        List<Integer> vowv = new ArrayList<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int val = c;
            if(vowels.indexOf(c)!=-1){
                vowi.add(i);
                vowv.add(val);
            }
        }

        if(vowi.size()<=0 || vowv.size()<=0 || vowi.size()!=vowv.size()){
            return s;
        }

        Collections.sort(vowv);
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<vowi.size();i++){
            sb.replace(vowi.get(i), vowi.get(i) + 1, String.valueOf((char)(int)vowv.get(i)));
        }
        return sb.toString();
    }
}