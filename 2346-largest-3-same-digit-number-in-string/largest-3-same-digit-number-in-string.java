class Solution {
    public String largestGoodInteger(String num) {
        if (num.length() < 3){
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 2) && num.charAt(i + 1) == num.charAt(i + 2)) {
                int pre = convert(sb);
                StringBuilder ss = new StringBuilder();
                ss.append(num.charAt(i));
                ss.append(num.charAt(i + 1));
                ss.append(num.charAt(i + 2));
                int now = convert(ss);
                if(now>=pre){
                    sb.setLength(0);
                    sb.append(ss.toString());
                }
            }
        }
        return sb.toString();
    }

    public int convert(StringBuilder sbs) {
        int ans = 0;
        try {
            ans = Integer.parseInt(sbs.toString());
        } catch (Exception e) {
            ans = 0;
        }
        return ans;
    }
}