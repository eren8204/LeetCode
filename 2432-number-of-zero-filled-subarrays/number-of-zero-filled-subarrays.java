class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        List<Long> lst = new ArrayList<>();
        int pre = 1;
        long temp = 0;
        for(int num : nums){
            if((num==pre && num==0) || (num==0)){
                temp++;
            }
            if(num!=pre && pre==0){
                lst.add(temp);
                temp = 0;
            }
            pre = num;
        }
        if(temp!=0)
            lst.add(temp);
        for(long n : lst)
            ans += (n*(n+1))/2;
        return ans;
    }
}