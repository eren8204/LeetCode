class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for(char a : s.toCharArray()){
            if(a=='(' || a=='[' || a=='{'){
                sb.append(a);
            }
            else if(a==')' || a==']' || a=='}'){
                char c = '*';
                if(sb.length()>0)
                    c = sb.charAt(sb.length()-1);
                if(!(c=='(' && a==')') && !(c=='[' && a==']') && !(c=='{' && a=='}'))
                    return false;
                else
                    sb.setLength(sb.length()-1);
            }    
        }
        if(sb.length()==0)
            return true;
        return false;    
    }
}