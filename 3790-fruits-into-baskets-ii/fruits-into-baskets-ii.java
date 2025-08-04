class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int idx1 = 0, idx2 = 0;
        int ans = 0;
        while(idx1<n && idx2<n){
            if(fruits[idx1]<=baskets[idx2]){
                idx1++;
                baskets[idx2]=-1;
                idx2=0;
            }
            else{
                idx2=idx2+1;
                if(idx2==n){
                    System.out.println(fruits[idx1]);
                    idx2=0;
                    idx1++;
                    ans++;
                    continue;
                }
            }
        }
        return ans;
    }
}