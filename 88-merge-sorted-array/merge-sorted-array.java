class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for(int i=0;i<m;i++)
            temp[i] = nums1[i];
        
        int idx1=0;
        int idx2=0;
        int x=0;
        while(idx1<m && idx2<n){
            if(temp[idx1]<nums2[idx2])
                nums1[x++] = temp[idx1++];
            else
                nums1[x++] = nums2[idx2++];
        }
        while(idx1<m){
            nums1[x++] = temp[idx1++];
        }
        while(idx2<n){
             nums1[x++] = nums2[idx2++];
        }
    }
}