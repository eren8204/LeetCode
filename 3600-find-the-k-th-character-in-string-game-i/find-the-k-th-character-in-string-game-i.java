class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        int i = 0;
        while(k>Math.pow(2,i))
            i++;
        while(i-->0){
            String s = sb.toString();
            for(int j=0;j<s.length();j++)
                if(s.charAt(j)=='z')
                    sb.append('a');
                else
                    sb.append((char)(s.charAt(j)+1));
        }
        return sb.toString().charAt(k-1);
    }
}