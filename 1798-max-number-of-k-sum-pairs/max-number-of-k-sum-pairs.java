class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==k){
                count++;
                i++;
                j--;
            }
            if(sum<k){
                i++;
            }
            if(sum>k){
                j--;
            }
        }
        return count;
    }
}