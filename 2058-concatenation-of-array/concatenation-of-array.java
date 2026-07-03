class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans= new int[2*nums.length];
        for(int n=0;n<nums.length;n++){
            ans[n]=nums[n];
        }
        for(int k=0,i=nums.length;k<nums.length && i<ans.length ;k++,i++){
            ans[i]=nums[k];
        }
        return ans;
    }
}