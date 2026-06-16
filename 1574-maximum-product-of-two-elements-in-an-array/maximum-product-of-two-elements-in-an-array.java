class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int d=nums[nums.length-1];
        int s=nums[nums.length-2];
        int p=(d-1)*(s-1);
        return p;
    }
}