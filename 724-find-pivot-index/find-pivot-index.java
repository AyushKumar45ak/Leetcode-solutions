class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum=rightsum+nums[i];
        }
        int leftsum=0;
        int val=0;
        for(int k=0;k<nums.length;k++){
            leftsum=leftsum+val;
            val=nums[k];
            rightsum=rightsum-val;
            if(rightsum==leftsum){
                return k;
            }
        }
        return -1;
    }
}