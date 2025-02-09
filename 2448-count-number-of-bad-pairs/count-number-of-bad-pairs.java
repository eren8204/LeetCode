class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long ans = (long)n*(n-1)/2;
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int d = nums[i]-i;
            ans -= map.getOrDefault(d,0L);
            map.put(d,map.getOrDefault(d,0L)+1);
        }
        return ans;
    }
}