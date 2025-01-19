class Solution {
    public int sumOfBeauties(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int[] max_ar = new int[n];
        int[] min_ar = new int[n];

        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            max_ar[i] = max;
        }
        
        for(int i=n-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            min_ar[i] = min;
        }

        int ans = 0;
        for(int i=1;i<n-1;i++){
            if(nums[i]>max_ar[i-1] && nums[i]<min_ar[i+1])
                ans+=2;
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1])
                ans+=1;
        }

        return ans;
    }
}