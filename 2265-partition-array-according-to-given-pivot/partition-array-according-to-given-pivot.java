class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        List<Integer> eq = new ArrayList<>();
        for(int num : nums){
            if(num<pivot)
                lst1.add(num);
            else if(num==pivot)
                eq.add(num);
            else
                lst2.add(num);
        }
        int n = lst1.size()+lst2.size()+eq.size();
        int ans[] = new int[lst1.size()+lst2.size()+eq.size()];
        int x = 0;
        for(int num : lst1)
            ans[x++] = num;
        for(int num : eq)
            ans[x++] = num;
        for(int num : lst2)
            ans[x++] = num;
        return ans;
    }
}