class Solution {
    public void moveZeroes(int[] nums) {
        int [] ans=new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[n]=nums[i];
                n++;
            }
        }
        for(int i=0;i<ans.length;i++){
            nums[i]=ans[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}