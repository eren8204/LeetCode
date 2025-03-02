class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1] =  nums[i-1]*2;
                nums[i] = 0;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int t = i;
                while(t<n-1 && nums[t]==0){
                    t++;
                }
                nums[i] = nums[t];
                nums[t] = 0;
            }
        }
        return nums;
    }
}