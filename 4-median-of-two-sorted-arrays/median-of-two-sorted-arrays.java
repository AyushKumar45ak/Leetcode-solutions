class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] temp=new int[nums1.length+nums2.length];
        int n=nums1.length+nums2.length;
        System.arraycopy(nums1,0,temp,0,nums1.length);
        System.arraycopy(nums2,0,temp,nums1.length,nums2.length);
        Arrays.sort(temp);
        if( n%2 != 0 ){
            int x;
            x=(n)/2;
            return temp[x];
        }
        else{
            float y;
            int a=n/2;
            y=(temp[a] + temp[a-1])/2.0f;
            return y;
        }
    }
}