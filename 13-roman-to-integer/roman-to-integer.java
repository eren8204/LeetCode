class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        // System.out.println(map.toString());

        int ans = 0;

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);
            int n = map.get(c);

            if(i>0){
                char b = s.charAt(i-1);
                int m = map.get(b);
                if((b == 'I' && c == 'V') || (b == 'I' && c == 'X') || (b == 'X' && c == 'L') ||
                (b == 'X' && c == 'C') || (b == 'C' && c == 'D') || (b == 'C' && c == 'M')){
                    ans += (n-(2*m));
                }
                else
                    ans += map.get(c);
            }
            else
                ans += map.get(c);
        }

        return ans;

    }
}