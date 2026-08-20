class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int x=m+n;
        int[] merged = new int[x];
         System.arraycopy(nums1,0,merged,0,m);
         System.arraycopy(nums2,0,merged,m,n);
         Arrays.sort(merged);
        

        double med;
        if(x%2==1)
        {
            med=merged[x/2];
        }
        else{
            med = (merged[x/2-1] +merged[x/ 2]) / 2.0;
        }
        
     return med;
    }
}