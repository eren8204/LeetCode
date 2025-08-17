class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i)!='9'){
                sb.replace(i,i+1,"9");
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}