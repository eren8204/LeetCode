class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        n = (n/2)+1;
        for(int num : nums)
            map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> e : map.entrySet())
            if(e.getValue()>=n)
                return e.getKey();

        return 0;
    }
}