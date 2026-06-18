class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=0;i<nums1.length && j<n;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[j++];
            }
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}