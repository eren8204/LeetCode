class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                int leftSum = arraySum(nums,0,i);
                int rightSum = arraySum(nums,i+1,l);
                if(leftSum==rightSum)
                    ans+=2;
                else if(Math.abs(leftSum-rightSum)==1)
                    ans+=1;
            }
        }
        return ans;
    }
    public int arraySum(int[] nums,int s, int e){
        int sum = 0;
        for(int i=s;i<e;i++)
            sum += nums[i];
        return sum;
    }
}