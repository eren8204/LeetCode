class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        int c = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
            if(e.getValue()>1)
                c+=e.getValue()/2;
        return c>=n/2;
    }
}