class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            if(num>0)
                set.add(num);
        if(set.isEmpty()){
            return Arrays.stream(nums).max().getAsInt();
        }
        int s = 0;
        for(int num : set)
            s += num;
        return s;
    }
}