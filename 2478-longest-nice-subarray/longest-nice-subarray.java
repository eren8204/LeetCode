class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start = 0;
        int bitmask = 0;
        int maxLength = 0;

        for (int end = 0; end < nums.length; end++) {
            while ((bitmask & nums[end]) != 0) {
                bitmask ^= nums[start]; 
                start++;
            }
            bitmask |= nums[end];
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
