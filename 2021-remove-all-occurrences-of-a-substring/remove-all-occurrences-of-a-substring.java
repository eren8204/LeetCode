class Solution {
    public String removeOccurrences(String s, String part) {
        int l = part.length();
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part)!=-1)
            sb.delete(sb.indexOf(part),sb.indexOf(part)+l);
        return sb.toString();
    }
}